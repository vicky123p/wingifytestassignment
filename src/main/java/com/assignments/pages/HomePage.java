package com.assignments.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.assignment.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(id = "amount")
	WebElement ele;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public void  clickOnamount() {
		List<WebElement> elementlist= driver.findElements(By.id("transactionsTable"));
		System.out.println("list of before sorting" +elementlist);
		ele.click();
		List<WebElement> list = driver.findElements(By.id("transactionsTable"));
		System.out.println("list of after sorting" +list);
		Assert.assertEquals(elementlist, list);
	}
	
	
}


