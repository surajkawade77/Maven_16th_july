package NeoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Reporter;

public class Utility2 
{
	//commonly used method
	//screenshot, wait, scrolling, excel reading
	
	public static String readDataFrompropertyFile(String key) throws EncryptedDocumentException, IOException
	{
		//create object of Properties class-->java
		Properties prop=new Properties();
		//create object of FileInputStream and pass properties file path as a parameter
		FileInputStream myfile=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\16th_july_A_Evening-Selenium\\src\\NeoStox.properties");
		
		prop.load(myfile);
		
		String value=prop.getProperty(key);
		
		Reporter.log("reading "+key+" from property file", true);
		return value;
	}
	
	public static void screenshot(WebDriver driver,String screenShotName) throws IOException
	{
		
		wait(driver,500);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File("D:\\My Folder\\Suraj\\"+screenShotName+".png");
	    org.openqa.selenium.io.FileHandler.copy(src, dest);
	    Reporter.log("taking screenshot", true);
	}
	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
	wait(driver, 500);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	Reporter.log("SCrolling into view",true);
	}
	public static void wait(WebDriver driver, int waitTime)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	Reporter.log("Waiting for "+waitTime+"ms",true);
	}

	
	}
	


