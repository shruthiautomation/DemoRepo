package com.qa.hrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hrm.Base.BaseClass;

public class LoginPage extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;
	
	@FindBy(xpath="//img[@src='/webres_5e7b15c4882d04.47780062/themes/default/images/login/logo.png']")
	WebElement logoimg;

	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginbtn;

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public boolean TitleTest() {
	String tt= driver.getTitle();
	return tt.contains("OrangeHRM");
	}
	
	public boolean ImageDisplay() {
		return logoimg.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) throws IOException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
		}
	

}
