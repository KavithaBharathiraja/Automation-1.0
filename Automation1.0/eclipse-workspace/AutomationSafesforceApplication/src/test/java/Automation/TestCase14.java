package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase14 {
	static WebDriver driver;
	public static void main(String[] args) {
		// Create account report
		

		LaunchApplication();
		Login();
		Accounts();
	    CreateAccountReport();	
		
	}	
		
	static void LaunchApplication() {
		
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
		driver.get("https://login.salesforce.com");		
}
   static void Login() {
  	 
	    WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("kavi@bharathiraja.com");
			
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");
		
		WebElement Login = driver.findElement(By.id("Login"));
		Login.click();
}	
   static void Accounts() {
	
	    WebElement Accounts = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));		 
	    Accounts.click();
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	    WebElement XAlert = driver.findElement(By.id("tryLexDialogX"));  
	    XAlert.click();
   }
   
	    static void CreateAccountReport() {
	    	
	    	 WebElement Accountswithlast30daysactivity = driver.findElement(By.xpath("//a[text( )='Accounts with last activity > 30 days']"));  
	    	 Accountswithlast30daysactivity.click();
	    	 
	    	 WebElement FromDay = driver.findElement(By.xpath("//img[@id='ext-gen152']"));  
	    	 FromDay.click();
	    	 
	    	 try {
	 			Thread.sleep(3000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	    	  
	    	// WebElement Today = driver.findElement(By.xpath("//button[@id='ext-gen281']")); 
	    	 //Actions action = new Actions(driver);
	    	 //action.moveToElement(Today).build().perform();
	    	 
	    	 WebElement Today = driver.findElement(By.xpath("//button[@id='ext-gen282']")); 
	    	 Today.click();    	 
	    	 
	 }
}




		

		
		
		
		

	


