package com.qa.hrm.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hrm.Base.BaseClass;
import com.qa.hrm.pages.HomePage;
import com.qa.hrm.pages.LoginPage;

public class LoginPageTest extends BaseClass {

	public HomePage homepage;
	
	 static LoginPage loginpage;
	
	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public static void SetUp() throws IOException {
		initialize();
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void ValidateTitleTest() {
		Assert.assertTrue(loginpage.TitleTest());
	}
	
	@Test(priority=2)
	public void ValidateImageDisplay() {
		Assert.assertTrue(loginpage.ImageDisplay());
	}
	
	@Test(priority=3)
	public void LoginTest() throws Throwable {
	homepage=	loginpage.login(prop.getProperty("Username"),prop.getProperty("Password"));
		
		
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
}
