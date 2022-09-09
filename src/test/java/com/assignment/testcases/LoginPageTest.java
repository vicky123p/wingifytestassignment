package com.assignment.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.base.TestBase;
import com.assignments.pages.HomePage;
import com.assignments.pages.LoginPage;

	public class LoginPageTest extends TestBase {
		LoginPage loginpage;
		HomePage homePage;
		
		public LoginPageTest() {
			super();
			}
		
		@BeforeMethod
		public void setUp() {
			
			Initialization();
			loginpage= new LoginPage();
		}
		
		@Test(priority=1)
		public void loginPageTest() {
			String title = loginpage.validateLoginpageTitle();
			Assert.assertEquals(title,"Demo App");
			
		}
		
		@Test(priority = 2)
		public void loginTest() {
			homePage =  loginpage.LoginPage(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		@Test(priority = 3)
		public void checkbox() {
			
			loginpage.validatescheckbox();
		}
		@Test(priority = 4)
		public void socialmedia() {
			 
			loginpage.validatesocialmediaImage();
		}
		
		 
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

	}

