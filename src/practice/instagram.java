package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.instagram.com/");
	
	driver.findElement(By.name("//input[contains(@name,'username')]")).sendKeys("8928201111");
	
	//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mh13au4912");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
