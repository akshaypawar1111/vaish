package POM_DDF_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x4_test
{
public static void main(String[] args) {
	
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\new chromedriver.exe\\chromedriver.exe");
	
	
	 driver =new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
	
	x1 a=new x1(driver);
	a.username();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
