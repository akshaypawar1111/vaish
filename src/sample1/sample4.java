package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4 
{
public static void main(String[] args) throws InterruptedException 
{
	
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(5000);
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(7000);
	
	driver.get("https://www.binance.com/en");
	
	Thread.sleep(8000);
	
	driver.get("https://coindcx.com/");
	
	Thread.sleep(10000);
	
	driver.close();
	
}
}
