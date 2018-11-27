package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SearchPage;

public class SearchPageTest extends TestBase{
	
	LoginPage loginPage;
	SearchPage searchPage;
	HomePage homePage;
	
	public SearchPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		//searchPage = loginPage.searchItem();
	//	homePage = new HomePage();
		loginPage.clickonLogin();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void selectSearchItemsTest() {
		searchPage = loginPage.searchItem();
		searchPage.selectItems();
	} 
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
