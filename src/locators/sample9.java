package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abccc");  // xpath attribute
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz");  
	
	driver.findElement(By.xpath("//button[text()='Log In']")).click();  //xpath by text
	
	
	
	
	
	
	
}
}
