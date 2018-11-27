package com.crm.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CardPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SearchPage;

public class CardPageTest extends TestBase {

	LoginPage loginPage;
	SearchPage searchPage;
	HomePage homePage;
	CardPage cardpage;
	
	public CardPageTest() {
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
		cardpage = new CardPage();
	}
	
	@Test(priority=1)
	public void addItemtoCardTest() {
		cardpage.addItermtoCard();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
