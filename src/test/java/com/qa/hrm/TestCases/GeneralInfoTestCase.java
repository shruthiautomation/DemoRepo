package com.qa.hrm.TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.hrm.Base.BaseClass;
import com.qa.hrm.pages.HomePage;
import com.qa.hrm.pages.LoginPage;
import com.qa.hrm.pages.OrgGeneralInfo;
import com.qa.hrm.utility.UtilTest;


public class GeneralInfoTestCase extends BaseClass{
	public static HomePage homepage;
	public static LoginPage loginpage;
	public static OrgGeneralInfo orggeneralinfo;
	 String SheetName = "org_general_info";

	public GeneralInfoTestCase() throws IOException {
		super();
	}

	@BeforeMethod
	public void SetUp() throws IOException {
		initialize();
		loginpage = new LoginPage();
		homepage =loginpage.login(prop.getProperty("Username"),prop.getProperty("Password"));
		homepage = new HomePage();
		homepage.OrganizationPage();
		orggeneralinfo = new OrgGeneralInfo();
		
	}
	
	@DataProvider
	public Object[][] getHRMdata() throws Exception, IOException  {

		Object[][] data = UtilTest.getTestData(SheetName);
		
		return data;
	}
	 
	@Test(dataProvider="getHRMdata")
	public void validateGenralInfo(String Organization_Name, CharSequence[] Phone_Number, String Email,
			String Address_street1, String City,CharSequence[] Postal_code, 
			CharSequence[] Tax_ID, String State, String country) throws IOException {
		
		orggeneralinfo.AddInfo(Organization_Name, Phone_Number,  Email, Address_street1,
				City, Postal_code,  Tax_ID,  State, country);
		}
}
