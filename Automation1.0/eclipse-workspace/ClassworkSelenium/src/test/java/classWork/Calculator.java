package classWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator {
	static WebDriver  driver;
	public static void main(String[] args) {
		// 2+3=5 using table
		
		Launchapplication();
		login();
		calculator(11,5,12);
		
		
		
	}
	
	static void Launchapplication() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");	
	}
	
	static void login() {
		
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		
		WebElement password=  driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		WebElement login= driver.findElement(By.xpath("//button[text()='Login to Account']"));
		login.click();
		
	}
		
	
	static void add() {
		
		
		driver.switchTo().frame((WebElement) By.xpath("//form[@name='calculator']"));
		
		WebElement Firstnumber = driver.findElement(By.xpath("//div[@class='container']/fieldset/form/input[11]"));
		Firstnumber.click();
		
		WebElement Add = driver.findElement(By.xpath("//div[@class='container']/fieldset/form/input[5]"));
		Add.click();
		
		WebElement Secondnumber = driver.findElement(By.xpath("//div[@class='container']/fieldset/form/input[12]"));
		Secondnumber.click();
			
		WebElement Equal = driver.findElement(By.xpath("//div[@class='container']/fieldset/form/input[16]"));
		Equal.click();
			
	}
	
	static void calculator(int n, int n1, int n2) {
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement Calculator=driver.findElement(By.xpath("//a[text()='Calculator']"));
		Calculator.click();
		
		
		
		List<WebElement> data = driver.findElements(By.xpath("//div[@class='container']/fieldset/form/input["+ n +"]"+"//div[@class='container']/fieldset/form/input["+ n1 +"]"+" \"//div[@class='container']/fieldset/form/input["+ n2 +"]"));
		
		for(WebElement totaldata:data) {
			 System.out.println(totaldata.getText());
		 }
		
		
		
	}
		

	

}
