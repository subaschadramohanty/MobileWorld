package PageObjModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class HomePage extends CommunMethods  
{
	@FindBy(xpath="//*[@id='navbarSupportedContent']/ul/li[1]/a[text()='Home ']")
	   private WebElement home_Tab;
	@FindBy(xpath="(//*[@id='navbarDropdown']/text())[1]")
	private WebElement Latest_DropDown;
	@FindBy(xpath="//*[@id='navbarSupportedContent']/ul/li[3]/a[text()='All Mobiles']")
	private WebElement allMobile_Tab;	
	@FindBy(linkText="Order")
	private WebElement order_Tab;
	
	@FindBy(xpath="//*[@id='home']/h1[text()='Welcome To Our Mobile World!']")
	private WebElement homePage_Header;
	@FindBy(xpath="//*[@id='navbarSupportedContent']/button[text()='SIGN IN']")
	private WebElement signIn_Button;

	
	
public HomePage WaitForHomePageToLoad()
{
	WaitForElement(homePage_Header);
	WaitForElement(home_Tab);
	
	WaitForElement(order_Tab);
	WaitForElement(signIn_Button);
	
	return this;
}

public HomePage ClickSignIn()
{
	WaitForElementToBeClickable(signIn_Button);
	Click(signIn_Button);
	return this;
}

public HomePage NavigateToOrderPage(String expectedText)
{
	WaitForElement(order_Tab);
	Click(order_Tab);
	
	SwitchToChildWindow();
	return this;
}
	
}
