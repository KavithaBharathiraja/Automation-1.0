package classWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4 {
	static WebDriver  driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launchapplication();	
		login();
		homeAction();
		movetoSwitchTab();
		clickOnAlert();
		clickonWindowAlert();
		
	}	
  static void launchapplication() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		
		String title= driver.getTitle();
		String ExpectedTitle = "Selenium";
		if(ExpectedTitle.equals(title)) {
			System.out.println("Browser successfuly launched");
		}else
		{
			System.out.println("Test Case failed");
		}	
     }	
   static void login() {
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement email = driver.findElement(By.id("email_field"));
			email.sendKeys("admin123@gmail.com");
			
			WebElement password=  driver.findElement(By.id("password_field"));
			password.sendKeys("admin123");
			
			WebElement login= driver.findElement(By.xpath("//button[text()='Login to Account']"));
			login.click();
			
			
		}
   static void homeAction() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement Home = driver.findElement(By.xpath("//a[text()='Home']"));
		Home.click();
		
		WebElement Name= driver.findElement(By.id("name"));
		Name.sendKeys("Kavitha");
		

		WebElement LastName= driver.findElement(By.name("lastname"));
		LastName.sendKeys("Bharathirja");

		WebElement female= driver.findElement(By.xpath("//input[@value='female']"));
		female.click();
		
		WebElement CityDropdown=driver.findElement(By.id("city"));
		Select City = new Select(CityDropdown);
		City.selectByVisibleText("GOA");	
		
   }		
   public static void movetoSwitchTab() {
		
		WebElement switchTo=driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		Actions action =new Actions(driver);	
		action.moveToElement(switchTo).build().perform();
		
		}
   public static void clickOnAlert() {
		
		WebElement Alert = driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		Alert.click();
	}
   public static void clickonWindowAlert() {
		
		WebElement windowAlert = driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]"));
		windowAlert.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
		
	}
		
		

	}


