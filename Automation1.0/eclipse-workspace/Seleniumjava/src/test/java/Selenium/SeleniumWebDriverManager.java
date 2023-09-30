package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverManager {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		//Enter in to the URl:
		
		
		driver.get("https://login.salesforce.com");
		
		//Enter the value into Text box
		//Identify the Text box
		//Enter the value
		
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("kavitha");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("password");
	
	//click on the button:
	
	WebElement login = driver.findElement(By.id("Login"));
	login.click();
	
	
	
	}

}
