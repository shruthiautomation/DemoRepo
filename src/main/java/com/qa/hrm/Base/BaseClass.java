package com.qa.hrm.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;
	
	public BaseClass() throws IOException{
	
	 prop = new Properties();
	FileInputStream file = new FileInputStream("C:\\Users\\Shruthi\\eclipse-workspace\\"
			+ "HRM\\src\\main\\java\\com\\qa\\hrm\\config\\configuration.properties");
	
	prop.load(file);
	}
	
	public static void initialize() {
		String br= prop.getProperty("browser");
		if(br.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shruthi\\"
					+ "Desktop\\shrusel\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
			
		}	
	}
	
}