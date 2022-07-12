package PageObjModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends CommunMethods  {

	@FindBy(xpath="//h1[text()='Registration Form']")
	private WebElement pageHeader;
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement firstName_Textbox;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastName_Textbox;
	@FindBy(xpath="//input[@placeholder='Enter Email']")
	private WebElement email_Textbox;
	
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password_Textbox;
	@FindBy(xpath="//input[@type='date']")
	private WebElement dob_Textbox;
	@FindBy(xpath="//input[@type='number']")
	private WebElement mobileNo_Textbox;
	@FindBy(xpath="//textarea[@placeholder='Short Bio']")
	private WebElement bio_Textbox;
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement signIn_Button;
	@FindBy(xpath="//button[text()='Register']")
	private WebElement regester_Button;
	@FindBy(xpath="//a[text()='Sign up']")
	private WebElement signUp_Button;
	@FindBy(xpath="	//label[.='Male']/../input[1]")
	private WebElement gender_Male;
	@FindBy(xpath="	//label[.='Female']/../input[1]")
	private WebElement gender_Female;
	
	
	//label[.='Male']/../input[1]
	
	
	public SignUpPage WaitForSignUpPageToLoad()
	{
		WaitForElement(pageHeader);
		WaitForElement(firstName_Textbox);
		WaitForElement(lastName_Textbox);
		WaitForElement(email_Textbox);
		WaitForElement(password_Textbox);
		WaitForElement(dob_Textbox);
		WaitForElement(mobileNo_Textbox);
		WaitForElement(bio_Textbox);
		WaitForElement(signIn_Button);
		WaitForElement(regester_Button);
		return this;
	}
	
	public SignUpPage InsertFirstName(String firstName)
	{
		SendKeys(firstName_Textbox,firstName);
		return this;
	}
	
	public SignUpPage InsertLastName(String lastName)
	{
		SendKeys(lastName_Textbox,lastName);
		return this;
	}
	
	public SignUpPage InsertEmailAddres(String email)
	{
		SendKeys(email_Textbox,email);
		return this;
	}
	public SignUpPage InsertPassword(String password)
	{
		SendKeys(password_Textbox,password);
		return this;
	}
	public SignUpPage InsertDOB(String dob)
	{
		SendKeys(dob_Textbox,dob);
		return this;
	}
	public SignUpPage InsertMobileNo(String mobileNo)
	{
		SendKeys(mobileNo_Textbox,mobileNo);
		return this;
	}
	public SignUpPage InsertBio(String bio)
	{
		SendKeys(bio_Textbox,bio);
		return this;
	}
	public SignUpPage ClickRegesterButton()
	{
		Click(regester_Button);
		return this;
		
		
	}
	
	
	public SignUpPage HandleAlertPopUp() 
	{
		
		try {
			AcceptAlertPopUp();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public SignUpPage NavigateToSignInPage()
	{
		WaitForElement(signIn_Button);
		Click(signIn_Button);
		
		return this;
	}
	public SignUpPage NavigateToSigUpPage()
	{
		WaitForElement(signUp_Button);
		Click(signUp_Button);
		
		return this;
	}
	public SignUpPage SelectGender(String gender)
	{
		if(gender.equalsIgnoreCase("male"))
		{
			WaitForElement(gender_Male);
			Click(gender_Male);
			
		}
		if(gender.equalsIgnoreCase("female"))
		{
			WaitForElement(gender_Female);
			Click(gender_Female);
		}
		return this;
	}
}
