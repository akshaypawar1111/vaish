package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1_sendkeys
{
public static void main(String[] args)         
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/login/");
	
	driver.findElement(By.id("email")).sendKeys("akshaypawar");            //sendkeys() -used to enter value in textbox
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
