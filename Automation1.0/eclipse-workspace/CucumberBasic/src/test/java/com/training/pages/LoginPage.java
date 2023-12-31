package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage {

	  static WebDriver driver;
	  
	public LoginPage() {
		
	super(driver= BaseTest.getDriver()); 
	
	addObject("Username", By.id("username"));
	addObject("Password",By.id("password"));
	addObject("Login", By.id("Login"));
	addObject("loginError", By.id("error"));
	addObject("RememberMe", By.id("rememberUn"));
	addObject("Forgotpassword",By.id("forgot_password_link"));
	addObject("FPusername", By.id("un"));
	addObject("continuelogin", By.id("continue"));	
	
	}	
	
}
