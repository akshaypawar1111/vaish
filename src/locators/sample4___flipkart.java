package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4___flipkart 
{
public static void main(String[] args) throws InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/account/login?ret=%2Fplus-offer-summary%2F2102T50ZEE01");
	
	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8928201111");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("akshay@123");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
