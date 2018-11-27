package com.crm.qa.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SearchPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	SearchPage searchPage;
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
	
	}
	
		//Verify the Homepage title
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Online Grocery Shopping and Online Supermarket in India - bigbasket");
	}
	/*
	//After login check for the username
	@Test(priority=2)
	public void verifyUserNameTest(){	
		Assert.assertTrue(homePage.verifyCorrectUserName());
	} */
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
