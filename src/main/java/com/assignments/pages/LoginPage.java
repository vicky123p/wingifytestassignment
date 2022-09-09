package com.assignments.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.base.TestBase;


public class LoginPage extends TestBase {
	
	//pagefactory - OR;
		@FindBy(id = "username")
		WebElement username;
		@FindBy(id = "password")
		WebElement password;
		
		@FindBy(id = "log-in")
		WebElement loginBtn;
		
		@FindBy(xpath = "//input[@type='checkbox']")
		WebElement checkbox;
		
		@FindBy(xpath ="/html/body/div/div/form/div[3]/div[2]")
		WebElement socialmedia;
		
		//initialization of constructor
		
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		public String validateLoginpageTitle() {
			return driver.getTitle();
		}
		
		public HomePage LoginPage(String una,String pwd) {
			username.sendKeys(una);
			password.sendKeys(pwd);
			loginBtn.click();
			
			return new HomePage();
		}
		public boolean validatesocialmediaImage() {
			return socialmedia .isDisplayed();
		}
		public boolean validatescheckbox() {
			return checkbox .isSelected();
		}
		
		
	

}
