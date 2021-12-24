package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1
{
public static void main(String[] args) 
{
	
	
System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");	

 WebDriver driver =new ChromeDriver();
 
 driver.get("https://en-gb.facebook.com/");
 
 //user name
 
 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8928201111");

 // password
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mh13au4912");
	
//submit button	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	

	
	
}}