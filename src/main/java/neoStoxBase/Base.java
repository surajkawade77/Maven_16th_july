package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base 
{
	protected WebDriver driver;
	public void launchBrowser() throws InterruptedException
	{
  
		System.setProperty("webdriver.chrome.driver", "D:\\My Folder\\Suraj\\My Documents\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/sign-in");
		Reporter.log("launching Browser", true);
		Thread.sleep(1000);
	}

}
