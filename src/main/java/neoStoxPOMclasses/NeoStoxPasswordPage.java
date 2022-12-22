package neoStoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.Utility;

public class NeoStoxPasswordPage 
{
	@FindBy(id="txt_accesspin")private WebElement passwordfield;
	@FindBy(id="lnk_submitaccesspin") private WebElement submitButton;
	
	public NeoStoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterPassword(WebDriver driver,String pass)
	{
		Utility.wait(driver, 3000);
		passwordfield.click();
		passwordfield.sendKeys(pass);
    	//Utility.wait(driver, 3000);
		//submitButton.click();
		Reporter.log("Entering password", true);
	}
	public void clickOnSubmitButton(WebDriver driver)
	{
		Utility.wait(driver, 3000);
		submitButton.click();
		Reporter.log("Clicking on submit button",true);
	}
	
}
