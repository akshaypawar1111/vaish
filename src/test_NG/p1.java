package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class p1 
{

	
	
	@Test
	public void tc1() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\new chromedriver.exe\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
		
		
		
		Thread.sleep(3000);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
