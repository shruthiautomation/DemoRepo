package com.qa.hrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hrm.Base.BaseClass;

public class AddJobTitlePage extends BaseClass {
	
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement editbtn;
	
	@FindBy(xpath="//input[@id='jobTitle_jobTitle']")
	WebElement jobtitle;
	
	@FindBy(xpath="//textarea[@id='jobTitle_jobDescription']")
	WebElement jobdes;
	
	@FindBy(xpath="//input[@id='jobTitle_jobSpec']")
	WebElement selectfile;
	

	@FindBy(xpath="//input[@id='btnSave']")
	WebElement savebtn;
	

	public AddJobTitlePage() throws IOException {
PageFactory.initElements(driver, this);
}
	

	public void JobTitleForm(String titlename) {
		editbtn.click();
		jobtitle.clear();
		jobtitle.sendKeys(titlename);
		jobdes.sendKeys("to automate a website");
		selectfile.sendKeys("F:\\sonata\\download.txt");
		
		savebtn.click();
		
		
	}
	
}
