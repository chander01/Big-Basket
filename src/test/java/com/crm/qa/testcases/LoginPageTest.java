package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CardPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.PaymentPage;
import com.crm.qa.pages.SearchPage;

public class LoginPageTest extends TestBase{

	
LoginPage loginPage;
SearchPage searchPage;
CardPage cardPage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void clickonLoginButtonTest() {
		loginPage.clickonLogin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
