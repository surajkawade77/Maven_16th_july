package neoStoxBase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import NeoStoxUtility.Utility2;

public class BaseNew 
{
	protected WebDriver driver;
	public void launchBrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
  
		System.setProperty("webdriver.chrome.driver", "D:\\My Folder\\Suraj\\My Documents\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility2.readDataFrompropertyFile("url"));
		Reporter.log("launching Browser", true);
		Thread.sleep(1000);
	}

}
