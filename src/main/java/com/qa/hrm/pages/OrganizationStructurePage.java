package com.qa.hrm.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hrm.Base.BaseClass;

public class OrganizationStructurePage extends BaseClass {

	@FindBy(xpath="//input[@name='btnEdit']")
	WebElement editlink;
	
	@FindBy(xpath="//a[@id='treeLink_addChild_1']")
	WebElement plusclick;
	
	public OrganizationStructurePage() throws IOException {
PageFactory.initElements(driver, this);
	}

	public void HandlingAlert() {
		editlink.click();
		plusclick.click();
		
		driver.findElement(By.xpath("//input[@id='txtUnit_Id']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys("Naveenk");
        
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		

		
	}
	
}
