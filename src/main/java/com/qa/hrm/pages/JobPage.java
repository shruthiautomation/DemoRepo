package com.qa.hrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hrm.Base.BaseClass;

public class JobPage extends BaseClass {

	
	@FindBy(xpath="//a[contains(text(),'HR Manager')]//parent::td//"
			+ "preceding-sibling::td//input[@id='ohrmList_chkSelectRecord_3']")
	WebElement hrmanager;
	
	@FindBy(xpath="//a[contains(text(), 'IT Manager')]//parent::td//"
			+ "preceding-sibling::td//input[@id='ohrmList_chkSelectRecord_8']")
	WebElement itmanager;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement addjobtitle;
	
	
	public JobPage() throws IOException {
PageFactory.initElements(driver, this);
	}
	
	public void JobTitle() {
		hrmanager.click();
		itmanager.click();
	}
	
	public AddJobTitlePage AddJobTitleTest() throws IOException {
		addjobtitle.click();
		return new AddJobTitlePage();
	}
	
	
	

}
