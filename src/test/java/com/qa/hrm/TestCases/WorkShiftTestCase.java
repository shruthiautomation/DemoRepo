package com.qa.hrm.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hrm.Base.BaseClass;
import com.qa.hrm.pages.HomePage;
import com.qa.hrm.pages.JobPage;
import com.qa.hrm.pages.LoginPage;
import com.qa.hrm.pages.WorkShiftPage;

public class WorkShiftTestCase extends BaseClass{
	
	public static LoginPage loginpage;
	public static HomePage homepage;
	public static JobPage jobpage;
	public static WorkShiftPage workshiftpage;
	
	public WorkShiftTestCase() throws IOException {
		super();
	}
	
	@BeforeMethod
		public static void SetUp() throws IOException {
			initialize();
			loginpage = new LoginPage();
			homepage = new HomePage();
			homepage=	loginpage.login(prop.getProperty("Username"),prop.getProperty("Password"));
			jobpage = new JobPage();
			workshiftpage= new WorkShiftPage(); 
			homepage.WorkShift();
			}
		
		

		@Test(priority=1)
		public void JobTitleForm() throws IOException {
			workshiftpage.AddEmp();
		}

		@AfterMethod
		public void TearDown() {
			driver.quit();
		}
	}

	
	
	
