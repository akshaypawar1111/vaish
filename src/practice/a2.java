package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a2 
{
 static public void main(String[] args) throws InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://en-gb.facebook.com/login/");
	
	WebElement un= driver.findElement(By.xpath("//input[@name='email']"));
	
	un.sendKeys("8928201111");
	Thread.sleep(3000);
	
	un.clear();
	Thread.sleep(3000);
	un.sendKeys("abcd");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
