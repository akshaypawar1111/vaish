package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5_isEnabled
{


public static void main(String[] args)         
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/login/");
	
	
	boolean enable = driver.findElement(By.xpath("//button[@name='login']")).isEnabled(); 
	
	System.out.println(enable);       //isEnabled - used to verify that element is enabled oe disabled
	
	System.out.println(".................................................");
	
	boolean e=driver.findElement(By.id("email")).isDisplayed();  // isDisplayed- This method is use to verify element is present or not
	
	System.out.println(e);
	
	
	
}}
