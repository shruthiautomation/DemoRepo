package com.qa.hrm.pages;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.hrm.Base.BaseClass;

public class WorkShiftPage extends BaseClass {
	public static Workbook book;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement addbutton;
	
	@FindBy(xpath="//a[@id='btnAssignEmployee']")
	WebElement addbtn;
	
	@FindBy(xpath="//a[@id='btnRemoveEmployee']")
	WebElement removebtn;
	
public WorkShiftPage() throws IOException {
PageFactory.initElements(driver, this);	
}

public void AddEmp() {
	addbutton.click();
Select select = new Select(driver.findElement(By.id("workShift_availableEmp")));
select.selectByVisibleText("Hannah Flores");
addbtn.click();
select.selectByVisibleText("Russel Hamilton");
addbtn.click();
select.selectByVisibleText("John Smith");
addbtn.click();
}

}
