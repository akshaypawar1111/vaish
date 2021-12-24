package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a4_id 
{
public static void main(String[] args)
{

	

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///E:/html/id.html");
	
	
	driver.findElement(By.id("akshay")).sendKeys("AKSHAY");
	
	
	driver.findElement(By.id("1234567890")).sendKeys("1122");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
