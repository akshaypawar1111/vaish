package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample93
{
public static void main(String[] args) 
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://twitter.com/i/flow/login");
	
	
	driver.findElement(By.className("//span[text()='Forgot password?']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
