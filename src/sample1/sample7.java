package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample7 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.binance.com/en");
	
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://meet.google.com/");
	Thread.sleep(3000);
	
	driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
	Thread.sleep(3000);
	
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.close();
	
	
	
	
	
}
	
}
