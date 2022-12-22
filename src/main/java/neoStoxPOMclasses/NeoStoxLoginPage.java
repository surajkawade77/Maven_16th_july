package neoStoxPOMclasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.Utility;

public class NeoStoxLoginPage 
{
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber") private WebElement mobNumField;
	@FindBy(id="lnk_signup1") private WebElement signinbutton;
	
	public NeoStoxLoginPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		
	}
	public void sendMobNum(WebDriver driver, String mobNum)
	{
		Utility.wait(driver, 1000);
		mobNumField.click();
		mobNumField.sendKeys(mobNum);
		Reporter.log("Entering Mobile number",true);
	}
	public void clickOnSignInButton(WebDriver driver)
	{
		Utility.wait(driver, 1000);
		signinbutton.click();
		Reporter.log("Clicking on SignIn Button",true);
	}

}
