package neoStoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.Utility;

public class NeoStoxHomePage 
{
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement okButton;
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closeButton;
	@FindBy(id="lbl_username") private WebElement userName;
	@FindBy(id = "lbl_curbalancetop") protected WebElement acBalance;
	@FindBy(xpath ="//span[text()='Logout']") private WebElement logOutButton;
	
	
	public NeoStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void handlePopUp(WebDriver driver) throws InterruptedException 
	{
		if (okButton.isDisplayed())
		{
		Utility.wait(driver, 1000);
		okButton.click();
		Reporter.log("Handling Popup",true);
		Reporter.log("clicking on OK button of Popup",true);
		Utility.wait(driver, 1000);
		closeButton.click();
		Reporter.log("clicking on Close button of Popup",true);
		}
		else
		{
			//closeButton.click();
			Reporter.log("there is no Popup", true);
			Thread.sleep(1000);
		}
		}
	public String getActualUserName(WebDriver driver)
	{
		Utility.wait(driver, 1000);
		String actualUserName=userName.getText();
		Reporter.log("getting actual user name = "+actualUserName,true);
		String realUserName=actualUserName.substring(3);
		return actualUserName;
	}
	public String getAccBalance(WebDriver driver)
	{
	Utility.wait(driver, 1000);
	String accBalance = acBalance.getText();
	Reporter.log("getting accBalance ", true);
	Reporter.log("Account Balance is "+accBalance,true);
	return accBalance;
	}
	public void logOut(WebDriver driver)
	{
	Utility.wait(driver, 1000);
	acBalance.click();
	//Utility.wait(driver, 1000);
	logOutButton.click();
	Reporter.log("Logging out", true);
	}
	
	
}
