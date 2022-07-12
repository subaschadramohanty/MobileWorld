package PageObjModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class SignInPage extends CommunMethods  
{
	@FindBy(id="username")
	private WebElement userName_Textbox;
	@FindBy(id="password")
	private WebElement password_Textbox;
	@FindBy(xpath="//a[text()='Log In']")
	private WebElement login_Button;
	@FindBy(xpath="//a[text()='Sign up']")
	private WebElement signUp_Link;


	
	public  SignInPage WaitForSighInPageToLoad()
	{
	WaitForElement(userName_Textbox);
	WaitForElement(password_Textbox);
	WaitForElement(login_Button);
	WaitForElement(signUp_Link);
	return this;
	}
		
	public SignInPage  signinIntoApp(String userName, String passWord)
	{
		//Perform login
		WaitForElement(userName_Textbox);
		SendKeys(userName_Textbox,userName);	
		WaitForElement(password_Textbox);
		SendKeys(password_Textbox,passWord);
		WaitForElement(login_Button);
		Click(login_Button);

		return this;
	}
	public SignInPage NavigateToSignUpPage()
	{
		Click(signUp_Link);
		return this;
	}

	
	


	
}