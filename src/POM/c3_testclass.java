package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_testclass 
{
public static void main(String[] args) {
	
	
	
	System.setProperty("webdriver.chrome.driver",
			"E:\\new chromedriver.exe\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	c1 a1=new c1(driver);
	
	a1.username();
	a1.password();
	a1.login();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
