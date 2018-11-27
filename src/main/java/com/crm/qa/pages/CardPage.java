package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class CardPage extends TestBase{
	
	
	//Page Factory - OR:
//	@FindBy(xpath=".//*[@id='root']/div/div/div/div[2]/div[2]/div/div[2]/div/div[5]/button")
//	WebElement addItertoCard;
			
	//Initializing the page objects:
	public void CardPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions:	
	public void addItermtoCard() {
		try {
			Thread.sleep(2000);
			WebElement addItertoCard = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div[2]/div[2]/div/div[2]/div/div[5]/button"));
			String text = addItertoCard.getText();
			System.out.println(" text "+text);
			addItertoCard.click();
			Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println("Item Out of Order, Try later Or select another Item = "+e);
		}
		
	}

}
