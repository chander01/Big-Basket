package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PaymentPage extends TestBase{
	
	
	//Page Factory - OR:
	@FindBy(xpath="//Img[contains(@text(),'Login with Facebook')]")
	WebElement paymentOption;
			
	@FindBy(xpath="//Img[contains(@text(),'Login with Google+')]")
	WebElement creditcard;
			

	@FindBy(id="uiv2-loginform")
	WebElement paymentlogin;
	
	@FindBy(id="password")
	WebElement paymentpassword;
	
	@FindBy(id="uiv2-loginform")
	WebElement paymentbutton;
	
	
	//Initializing the page objects:
	public void PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public void clickOnFacebookOption() {
		paymentOption.click();
	}
	
	public void selectOnGoogleOption() {
		creditcard.click();
	}
	
	public void loginToPaymentsite() {
		paymentbutton.click();
	}
	
}
