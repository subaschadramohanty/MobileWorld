package PageObjModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends CommunMethods{

	@FindBy(xpath="//h2[text()='Place Your Order Here!']")
	private WebElement pageHeader;
	@FindBy(id="inputFirstName")
	private WebElement firstName_Textbox;
	@FindBy(xpath="//label[.='First Name']/following-sibling::input[1]")
	private WebElement lastName_Textbox;
	@FindBy(id="inputEmail")
	private WebElement email_Textbox;
	
	
	@FindBy(id="inputPassword")
	private WebElement password_Textbox;
	@FindBy(id="flexRadioDefault2")
	private WebElement female_radioButton;

	@FindBy(xpath="//input[@placeholder='00000000000']")
	private WebElement mobileNo_Textbox;
	@FindBy(xpath="//input[@id=' address1']")
	private WebElement address1_TextBox;
	
	
	@FindBy(xpath="//input[@id='inputCity']")
	private WebElement city_Textbox;
	@FindBy(xpath="//input[@id='address2']")
	private WebElement address2_TextBox;
	
	
	@FindBy(xpath="//select[@id='inputState']")
	private WebElement state_DropDown;
	@FindBy(id="inputZip")
	private WebElement Zip_TextBox;
	
	
	@FindBy(xpath="//label[.='Apple']")
	private WebElement appleBrand;
	
	@FindBy(xpath="//label[.='Samsung']")
	private WebElement samsungBrand;

	@FindBy(xpath="//label[.='Lenovo']")
	private WebElement lenovoBrand;
	
	@FindBy(xpath="//select[@class='multi_select']")
	private WebElement model_DropDown;
	@FindBy(xpath="//input[@placeholder='no of mobiles']")
	private WebElement countOfMobile;
	@FindBy(xpath="//select[@id='bought']")
	private WebElement bought_DropDown;
	
	@FindBy(xpath="//input[@id='time']")
	private WebElement noOfTimes_TextBox;
	
	@FindBy(xpath="(//input[@id='gridCheck1'])[1]")
	private WebElement address_CheckBox;
	@FindBy(xpath="(//input[@id='gridCheck1'])[2]")
	private WebElement mobileNumber_CheckBox;
	@FindBy(xpath="//button[contains(.,'Ord')]")
	private WebElement orderNow_Button;
	@FindBy(xpath="//div/a[text()='Close']")
	private WebElement closePopUp_Button;
	@FindBy(linkText="Contact Us")
	private WebElement contactUs_Tab;
	
	
	public OrderPage InsertFirstName(String firstName)
	{
		WaitForElement(firstName_Textbox);
		SendKeys(firstName_Textbox,firstName);
		return this;
	}
	
	public OrderPage InsertLastName(String lastName)
	{
		WaitForElement(lastName_Textbox);
		SendKeys(lastName_Textbox,lastName);
		return this;
	}
	
	public OrderPage InsertEmailAddres(String email)
	{
		WaitForElement(email_Textbox);
		SendKeys(email_Textbox,email);
		return this;
	}
	public OrderPage InsertPassword(String password)
	{
		WaitForElement(password_Textbox);
		SendKeys(password_Textbox,password);
		return this;
	}
	
	public OrderPage SelectGender()
	{
		
		WaitForElement(female_radioButton);
		Click(female_radioButton);
		return this;
	}
	public OrderPage InsertMobileNumber(String number)
	{
		WaitForElement(mobileNo_Textbox);
		SendKeys(mobileNo_Textbox,number);
		return this;
	}
	public OrderPage InsertAddress1(String address)
	{
		WaitForElement(address1_TextBox);
		SendKeys(address1_TextBox,address);
		return this;
	}
	public OrderPage InsertAddress2(String address)
	{
		WaitForElement(address2_TextBox);
		SendKeys(address2_TextBox,address);
		return this;
	}
	public OrderPage InsertCity(String city)
	{
		WaitForElement(city_Textbox);
		SendKeys(city_Textbox,city);
		return this;
	}
	public OrderPage SelectState(String state)
	{
		WaitForElement(state_DropDown);
		SelectPicklistElementByText(state_DropDown, state);
		
		return this;
	}
	public OrderPage InsertZipCode(String zipCode)
	{
		WaitForElement(Zip_TextBox);
		SendKeys(Zip_TextBox,zipCode);
		return this;
	}
	
	public OrderPage SelectBrand(String brand)
	{
		if(brand.equalsIgnoreCase("apple"))
		{
		WaitForElement(appleBrand);
		Click(appleBrand);
		}
		if(brand.equalsIgnoreCase("samsung"))
		{
			WaitForElement(samsungBrand);
			Click(samsungBrand);
		}
		if(brand.equalsIgnoreCase("lenovo"))
		{
			WaitForElement(lenovoBrand);
			Click(lenovoBrand);
		}
		
		return this;
	}
	
	
	
	public OrderPage SelectModel(String models)
	{
		WaitForElement(model_DropDown);
	SelectPicklistElementByText(model_DropDown, models);
	return this;
	}
	public OrderPage InsertCount(String count)
	{
		WaitForElement(countOfMobile);
		SendKeys(countOfMobile,count);
		return this;
	}
	
	
	public OrderPage SelectBoughtAlready(String expectedText)
	{
		WaitForElement(bought_DropDown);
		SelectPicklistElementByText(bought_DropDown, expectedText);
		return this;
	}
	
	public OrderPage InsertNumberOfTimes(String numberOfTimes)
	{
		WaitForElement(noOfTimes_TextBox);
		SendKeys(noOfTimes_TextBox,numberOfTimes);
		return this;
	}
	public OrderPage SelectIfYourAddressIsCorrect()
	{
		WaitForElement(address_CheckBox);
		Click(address_CheckBox);
		return this;
	}
	public OrderPage SelectIfYourMobileNumberIsCorrect()
	{
		WaitForElement(mobileNumber_CheckBox);
		Click(mobileNumber_CheckBox);
		return this;
	}
	public OrderPage ClickOrderNow()
	{
		WaitForElement(orderNow_Button);
		Click(orderNow_Button);
		return this;
	}
	public OrderPage ClickClosePopUp()
	{
		WaitForElement(closePopUp_Button);
		Click(closePopUp_Button);
		return this;
	}
	public OrderPage NavigateToContactUsPage()
	{
		WaitForElement(contactUs_Tab);
			Click(contactUs_Tab);
			
			SwitchToChildWindow();
			
			return this;
		}
}
