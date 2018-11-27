package com.crm.qa.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SearchPage extends TestBase{
	
	//Page Factory - OR:
	
//	@FindBy(xpath="//product-template[contains(@class,'ng-isolate-scope')]")
//	List<WebElement> searchresultElements;
	
	
	public void SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CardPage selectItems() {
		
		try {
			Thread.sleep(3000);
		
		List<WebElement> text = driver.findElements(By.xpath("//product-template[contains(@class,'ng-isolate-scope')]"));
		
		for(WebElement e : text) {
			  if(e.getText().contains(prop.getProperty("search"))) {
				  e.click();
				  break;
			  }
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new CardPage();
		
	}
} 
