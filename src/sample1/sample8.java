package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample8 {
public static void main(String[] args) throws InterruptedException {
	
	
	
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver= new ChromeDriver();
	
	
	driver.navigate().to("https://www.instagram.com/");
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.binance.com/en");
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	
	
	Thread.sleep(2000);
	
	driver.quit();
	
	
	
	
	
}
}
