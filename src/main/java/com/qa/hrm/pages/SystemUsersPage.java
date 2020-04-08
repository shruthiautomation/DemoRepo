package com.qa.hrm.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.hrm.Base.BaseClass;

public class SystemUsersPage extends BaseClass {

	
	@FindBy(id="searchSystemUser_userName")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='searchSystemUser_employeeName_empName']")
	WebElement empname ;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement addbtn;
	
	public SystemUsersPage() throws IOException {
PageFactory.initElements(driver, this);
	}

	public void SystemUserForm() {
		Username.sendKeys("hannah.flores");
		Select select = new Select(driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']")));
		select.selectByVisibleText("ESS");
		empname.sendKeys("hannah flores");
	//	Actions action = new Actions(driver);
	 //action.moveToElement(driver.findElement(By.xpath("//li[@class='ac_even ac_over']"))).build().perform();
	// driver.findElement(By.xpath("//li[@class='ac_even ac_over']")).click();
	 Select sel = new Select(driver.findElement(By.xpath("//select[@id='searchSystemUser_status']")));
	 sel.selectByVisibleText("Enabled");
	 driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}
	
	public EditPage AddbtnTest() throws IOException {
		addbtn.click();
		return new EditPage();
	}

}
