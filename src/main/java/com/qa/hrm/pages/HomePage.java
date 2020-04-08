package com.qa.hrm.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hrm.Base.BaseClass;

public class HomePage extends BaseClass {
	public SystemUsersPage su;
	
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
	WebElement adminlink;
	
public HomePage() throws IOException {
PageFactory.initElements(driver, this);	
}
	
	public SystemUsersPage AdminLinkTest() throws IOException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//b[contains(text(),'Admin')]"))).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"))).build().perform();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
        return new SystemUsersPage();
		
	}
	
	public JobPage AdminJobtest() throws IOException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//b[contains(text(),'Admin')]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_Job']"))).build().perform();
		 driver.findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList']")).click();
		 return new JobPage();
	}
	
	public WorkShiftPage WorkShift() throws IOException {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//b[contains(text(),'Admin')]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_Job']"))).build().perform();
		 driver.findElement(By.xpath("//a[@id='menu_admin_workShift']")).click();
		 return new WorkShiftPage();
		
	}
	
	public OrgGeneralInfo OrganizationPage() throws IOException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//b[contains(text(),'Admin')]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_Organization']"))).build().perform();
		 driver.findElement(By.xpath("//a[@id='menu_admin_viewOrganizationGeneralInformation']")).click();
		 return new OrgGeneralInfo();
	}
	
	public OrganizationStructurePage Organization() throws IOException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//b[contains(text(),'Admin')]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_Organization']"))).build().perform();
		 driver.findElement(By.xpath("//a[@id='menu_admin_viewCompanyStructure']")).click();
		 return new OrganizationStructurePage();
	}

}
