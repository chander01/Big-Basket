package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath=".//*[@id='headerControllerId']/div[3]/header/div/div/div/div/ul/li[3]/div/a/span[1]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//input[@id='input']")
	WebElement searchbox;
	
	@FindBy(xpath=".//*[@id='navbar-main']/div/div[3]/div/div/button")
	WebElement searchboxBtn;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement backtohomepage;
	
	//Initializing the page objects:
	public void HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public boolean verifyCorrectUserName(){	
		return userNameLabel.isDisplayed();
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public void backtoLoingPage() {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOf(backtohomepage));
		backtohomepage.click();
	}
	
}
