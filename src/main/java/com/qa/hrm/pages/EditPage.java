package com.qa.hrm.pages;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hrm.Base.BaseClass;

public class EditPage extends BaseClass {
	public static HomePage homepage;
	public static LoginPage loginpage;
	public static SystemUsersPage systemuserspage;
	public static EditPage editpage;
	
	public EditPage() throws IOException {
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
	
	@Test
	public void EditPageTest() throws IOException {
		systemuserspage.AddbtnTest();
	}
}

////a[contains(text(),'HR Manager')]//parent::td//preceding-sibling::td//input[@id='ohrmList_chkSelectRecord_3']
