package neoStoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.Utility;

public class NeoStoxSignInPage 
{

	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement signINButton;
	public NeoStoxSignInPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void clickOnSignInButton(WebDriver driver)
	{
	Utility.wait(driver, 1000);
	Reporter.log("Clicking on Sign In button", true);
	signINButton.click();
	}

}
