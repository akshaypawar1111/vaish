package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3_tagname 
{
public static void main(String[] args)
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///E:/html/tagname.html");
	
	driver.findElement(By.tagName("input")).sendKeys("abcdef");
	
	
	driver.findElement(By.tagName("input")).sendKeys("12345");   
	
	
	
	
	
	
	
	
	
	
	
	
}
}
