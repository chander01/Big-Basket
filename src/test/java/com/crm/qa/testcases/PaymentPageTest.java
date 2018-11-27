package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CardPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.PaymentPage;
import com.crm.qa.pages.SearchPage;

public class PaymentPageTest extends TestBase{
	
	LoginPage loginPage;
	SearchPage searchPage;
	HomePage homePage;
	CardPage cardpage;
	PaymentPage paymentpage;
	
	public PaymentPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		searchPage = new SearchPage();
		homePage = new HomePage();
		searchPage = loginPage.searchItem();
		cardpage = searchPage.selectItems();
		}
	
	@Test(priority=1)
	public void dothePayment() {
		cardpage.addItermtoCard();
		loginPage.clickonMyBasaketItem();
		loginPage.clickonLogin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
