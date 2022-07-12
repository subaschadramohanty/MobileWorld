package MobileWorld_UITestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjModule.*;
import Utilities.BaseClass;
import Utilities.Constants;
public class SignUp_UITestCases extends BaseClass{

	

	@Test()
    //Descripton -"Log into app -> Click on admin-> Click UserManagement ->Click ADD button to create new record"
	//+"->  Fill all the mendatory fields ->click save";
	public void SystemUser_001()
	{
	    
		HomePage homepage=PageFactory.initElements(driver, HomePage.class);
		SignInPage signpage=PageFactory.initElements(driver, SignInPage.class);
		SignUpPage signuppage=PageFactory.initElements(driver, SignUpPage.class);
		OrderPage orderpage=PageFactory.initElements(driver, OrderPage.class);
		ContactUsPage contactuspage=PageFactory.initElements(driver, ContactUsPage.class);
		
		
	homepage
		.WaitForHomePageToLoad()
		.ClickSignIn();
		
	signpage
       .WaitForSighInPageToLoad()
       .NavigateToSignUpPage();
		
	signuppage
		.WaitForSignUpPageToLoad()
		.InsertFirstName("subhashree")
		.InsertLastName("NAYAK")
		.InsertEmailAddres("subahashreenayak480@gmail.com")
		.InsertPassword("subhashree12345")
		.InsertDOB("05/04/1990")
		.SelectGender("Female")
		.InsertMobileNo("8144479891")
		.InsertBio("anything")
		.ClickRegesterButton()
		.HandleAlertPopUp()
		.NavigateToSignInPage()
		.HandleAlertPopUp();
	
	signpage
	    .WaitForSighInPageToLoad()
	    .signinIntoApp(Constants.email_Addres,Constants.passWord);
	    
	
	homepage
	    .WaitForHomePageToLoad()
	    .NavigateToOrderPage("Order");
	
	orderpage
	    .InsertFirstName("subhashree")
	    .InsertLastName("Nayak")
	    .InsertEmailAddres("subhashree@gmail.com")
            .InsertPassword("avcd@1234")
            .InsertMobileNumber("132451222")
            .InsertAddress1("sc-27")
            .InsertAddress2("sec-22")
            .InsertCity("Bengalore")
            .SelectState("Karnataka")
            .InsertZipCode("6372634")
            .SelectBrand("Samsung")
            .InsertCount("2")
            .SelectBoughtAlready("Yes")
            .InsertNumberOfTimes("2")
            .SelectIfYourAddressIsCorrect()
            .SelectIfYourMobileNumberIsCorrect()
            .ClickOrderNow()
            .ClickClosePopUp()
            .NavigateToContactUsPage();
   
	
	contactuspage
	    .WaitForContactUsPageToLoad()
	    .InsertUserName("Subhashree Nayak")
	    .InsertEmailAddress("subhashree480@gmail.com")
	    .InsertPhoneNumber("6892738763")
	    .InsertMessageBox("Hii I am subhashree Nayak")
	    .ClickSendButton();
	
	
	
	
	
	
		
		
	}
}
