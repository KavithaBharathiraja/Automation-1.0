package classWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Day1 {
      static WebDriver driver;
	public static void main(String[] args) {
		// Launch and Login
		Launch();
		Login() ;
			
		
	}		
		
	static void Launch() {
		
		WebDriver driver = new ChromeDriver();
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
		
		
		
		
	}
	
	
	
	
	
	


