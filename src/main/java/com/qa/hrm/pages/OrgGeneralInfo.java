package com.qa.hrm.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.hrm.Base.BaseClass;

public class OrgGeneralInfo extends BaseClass {
	
	@FindBy(xpath="//input[@id='btnSaveGenInfo']")
	WebElement editbtn;
	
	@FindBy(xpath="//input[@id='organization_name']")
	WebElement orgname;
	
	@FindBy(xpath="//input[@id='organization_phone']")
	WebElement phonenum;
	
	@FindBy(xpath="//input[@id='organization_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='organization_street1']")
	WebElement streetname;
	
	@FindBy(xpath="//input[@id='organization_city']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='organization_zipCode']")
	WebElement postalcode;
	
	@FindBy(xpath="//input[@id='organization_taxId']")
	WebElement taxid;
	
	@FindBy(xpath="//input[@id='organization_province']")
	WebElement state;

	public OrgGeneralInfo() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void AddInfo(String oname, CharSequence[] phno, String em,
			String adrs, String cty,CharSequence[] postcode, CharSequence[] tax, String st, String country) {
		editbtn.click();
		orgname.clear();
		orgname.sendKeys(oname);
		phonenum.sendKeys(phno);
		email.clear();
		email.sendKeys(em);
		streetname.clear();
		streetname.sendKeys(adrs);
		city.clear();
		city.sendKeys(cty);
		postalcode.sendKeys(postcode);
		taxid.clear();
		taxid.sendKeys(tax);
		state.clear();
		state.sendKeys(st);
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='organization_country']")));
		sel.selectByVisibleText(country);
		
		driver.findElement(By.xpath("//input[@id='btnSaveGenInfo']")).click();
		
	}
}
