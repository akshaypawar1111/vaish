package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{
public static void main(String[] args) throws InterruptedException
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://accounts.binance.com/en/login?return_to=aHR0cHM6Ly93d3cuYmluYW5jZS5jb20vZW4%3D");
	
	driver.findElement(By.xpath("//div[@class=' css-q9sxwh']")).click();
	
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8928201111");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Akshay@4912");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id='click_login_submit']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
