package com.assignment.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.base.TestBase;
import com.assignments.pages.HomePage;
import com.assignments.pages.LoginPage;

public class HomePageTestcases extends TestBase {
	
	LoginPage loginpage;
	HomePage homePage;
	
	public HomePageTestcases() {
		super();
		}
	
	@BeforeMethod
	public void setUp() {
		
		Initialization();
		loginpage= new LoginPage();
		homePage = loginpage.LoginPage(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void Homepagetest() {
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title,"Demo App");
	}
	
	@Test(priority = 2)
	public void sort() {
		homePage.clickOnamount();
		System.out.println("element is sorted");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
