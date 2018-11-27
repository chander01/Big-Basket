package com.crm.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	//Page Factory - OR:
	
	//BigBasket
	@FindBy(xpath="//input[@id='input']")
	WebElement searchbox;
	
	@FindBy(xpath=".//*[@id='navbar-main']/div/div[3]/div/div/button")
	WebElement searchboxBtn;
	
	@FindBy(xpath=".//*[@id='dynamicDirective']/product-deck/section/div[2]/div[4]/div[1]/div/div[1]/div[2]/div/div[1]/product-template/div/div[4]/div[1]/a")
	WebElement orange;
	
	@FindBy(id="signin-url")
	WebElement login;
	
	@FindBy(xpath=".//*[@id='navbar-main']/div/div/div[1]/a")
	WebElement logo;
	
	@FindBy(xpath=".//*[@id='headerControllerId']/div[3]/header/div/div/div/div/ul/li[3]/ul/li[2]/a[3]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//label[contains(text(),'Email')]")
	WebElement emaillogin;
	
	@FindBy(xpath="//label[contains(text(),'Password')]")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'LOGIN')]")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[contains(@class,'my-basket-btn')]")
	WebElement mybasketbin;
	
	@FindBy(xpath="//button[contains(text(),'View Basket & Checkout')]")
	WebElement checkoutItem;
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement addtoCardBtn;
	
	//Initializing the page objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public void clickonLogin() {
		signUpBtn.click();
	}
	
	public SearchPage searchItem() {
		searchbox.clear();
		searchbox.sendKeys("Orange");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", searchboxBtn);
		return new SearchPage();
	}

	
	public HomePage login(String userid, String pwd) {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOf(emaillogin));
		Actions actions1 = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		actions1.moveToElement(emaillogin).pause(200);
		js.executeScript("arguments[0].click();", emaillogin);
		actions1.sendKeys(userid);
		actions1.build().perform();
		actions1.moveToElement(password);
		actions1.click();
		actions1.sendKeys(pwd);
		actions1.build().perform();
		
		
		loginBtn.click();
		
		return new HomePage();
	}
	
	public PaymentPage clickonMyBasaketItem() {
		Actions actions1 = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		actions1.moveToElement(mybasketbin).pause(200);
		actions1.build().perform();
		js.executeScript("arguments[0].click();", mybasketbin);
		checkoutItem.click();
		return new PaymentPage();
	}
	
	public CardPage addontoMyCard() {
		Actions actions1 = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		actions1.moveToElement(addtoCardBtn).pause(200);
		actions1.build().perform();
		js.executeScript("arguments[0].click();", addtoCardBtn);
		checkoutItem.click();
		return new CardPage();
		
	}
	
}
