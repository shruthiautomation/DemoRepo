package com.qa.hrm.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hrm.Base.BaseClass;
import com.qa.hrm.pages.HomePage;
import com.qa.hrm.pages.LoginPage;
import com.qa.hrm.pages.SystemUsersPage;

public class SystemUserTestCase extends BaseClass{
public static HomePage homepage;
public static LoginPage loginpage;
public static SystemUsersPage systemuserspage;

	public SystemUserTestCase() throws IOException {
		super();
	}

	@BeforeMethod
	public static void SetUp() throws IOException {
		initialize();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage=	loginpage.login(prop.getProperty("Username"),prop.getProperty("Password"));
		homepage.AdminLinkTest();
		systemuserspage = new SystemUsersPage();
		}
	
	@Test(priority=1)
	public void ValidateSystemUsers() throws IOException {
		systemuserspage.SystemUserForm();
		}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

	
}
