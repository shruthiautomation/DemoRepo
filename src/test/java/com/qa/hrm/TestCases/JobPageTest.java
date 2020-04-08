package com.qa.hrm.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hrm.Base.BaseClass;
import com.qa.hrm.pages.HomePage;
import com.qa.hrm.pages.JobPage;
import com.qa.hrm.pages.LoginPage;

public class JobPageTest extends BaseClass{
public static LoginPage loginpage;
public static HomePage homepage;
public static JobPage jobpage;


	public JobPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public static void SetUp() throws IOException {
		initialize();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage=	loginpage.login(prop.getProperty("Username"),prop.getProperty("Password"));
		jobpage = new JobPage();
		homepage.AdminJobtest();
		}
	
	@Test(priority=1)
	public void ValidateJobTitleCheckboxClick() throws IOException {
		jobpage.JobTitle();
	}

	@Test
	public void AddTitleTestCase() throws IOException {
		jobpage.AddJobTitleTest();
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
