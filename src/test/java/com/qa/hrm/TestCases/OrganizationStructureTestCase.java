package com.qa.hrm.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hrm.Base.BaseClass;
import com.qa.hrm.pages.HomePage;
import com.qa.hrm.pages.LoginPage;
import com.qa.hrm.pages.OrganizationStructurePage;

public class OrganizationStructureTestCase extends BaseClass{

	public static HomePage homepage;
	public static LoginPage loginpage;
	public static OrganizationStructurePage org;
	public  OrganizationStructureTestCase() throws IOException {
		super();
	}

	@BeforeMethod
	public void SetUp() throws IOException {
		initialize();
		loginpage = new LoginPage();
		homepage =loginpage.login(prop.getProperty("Username"),prop.getProperty("Password"));
		homepage = new HomePage();
		homepage.Organization();
		org = new OrganizationStructurePage();
}
	
	@Test
	public void ValidateAlert() {
		org.HandlingAlert();
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
