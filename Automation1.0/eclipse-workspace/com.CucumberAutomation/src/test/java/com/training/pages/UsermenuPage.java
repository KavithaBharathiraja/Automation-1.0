package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class UsermenuPage extends BasePage {
	
	static WebDriver driver;
	
	
	public UsermenuPage() {
		
		super(driver= BaseTest.getDriver());
		
		addObject("Username", By.id("username"));
		addObject("Password",By.id("password"));
		addObject("Login", By.id("Login"));
		addObject("profile", By.xpath("//a[contains (text (),'My Profile')]"));
		addObject("editprofile",By.xpath("//img[@alt='Edit Profile']"));
		addObject("usermenu", By.id("userNav-arrow"));
		addObject("loginError", By.id("error"));
		addObject ("UserMenu", By.xpath("//span [@id='userNavLabel']"));
		addObject("MySettings", By.xpath("//a[contains (text (),'My Settings')]'"));
		addObject ("DevloperConsole", By.xpath("//a[contains(text (), 'Developer Console')]'"));
		}		

	
	
	
}
