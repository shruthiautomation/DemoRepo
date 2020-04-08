package com.qa.hrm.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hrm.Base.BaseClass;
import com.qa.hrm.pages.HomePage;
import com.qa.hrm.pages.LoginPage;

public class HomeTestCase extends BaseClass{
public static LoginPage loginpage;
public static HomePage homepage;
	public HomeTestCase() throws IOException {
		super();
	}
	
	
	@BeforeMethod
	public static void SetUp() throws IOException {
		initialize();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage=	loginpage.login(prop.getProperty("Username"),prop.getProperty("Password"));
		}
	
	@Test(priority=1)
	public void ValidateAdminLinkTest() throws IOException {
		homepage.AdminLinkTest();
		
	}
	
	@Test
	public void validateAdminJobTest() throws IOException {
		homepage.AdminJobtest();
		}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
