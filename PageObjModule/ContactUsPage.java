package PageObjModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends CommunMethods{

	
	@FindBy(xpath="//input[@type='text']")
	   private WebElement user_Name;
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailAddress;
	@FindBy(xpath="//input[@type='tel']")
	private WebElement contact_No;	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement messageBox;
	@FindBy(xpath="//input[@value='Send']")
	private WebElement sendButton;
	
	
	public ContactUsPage WaitForContactUsPageToLoad()
	{
		WaitForElement(user_Name);
		WaitForElement(emailAddress);
		WaitForElement(contact_No);
		WaitForElement(messageBox);
		WaitForElement(sendButton);
		return this;
	}
	
	public ContactUsPage InsertUserName(String name)
	{
	SendKeys(user_Name,name);
	return this;
		
	}
	public ContactUsPage InsertEmailAddress(String email)
	{
		SendKeys(emailAddress,email);
		return this;
	}
	public ContactUsPage InsertPhoneNumber(String phoneNumber)
	{
		SendKeys(contact_No,phoneNumber);
		return this;
	}
	public ContactUsPage InsertMessageBox(String message)
	{
		SendKeys(messageBox,message);
		return this;
	}
	
	public ContactUsPage ClickSendButton()
	{
		Click(sendButton);
		return this;
	}
	
	
	
	
}
