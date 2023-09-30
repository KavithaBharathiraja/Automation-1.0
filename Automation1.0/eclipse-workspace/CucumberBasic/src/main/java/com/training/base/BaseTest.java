package com.training.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.trining.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    static  WebDriver driver;
    static CommonUtilities common = new CommonUtilities();
    static String url;
    
	public static void lauchapplication() throws IOException {
		
		driver = getDriver();
		
			String url = common.getapplicationProperty("url");	
             driver.get(url);
			
	}
	public static WebDriver getDriver() {
		if(driver==null) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	return driver;
	
	}
	
}
