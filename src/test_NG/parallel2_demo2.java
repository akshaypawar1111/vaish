package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel2_demo2
{
	@Test
	public void m2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\new chromedriver.exe\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://flipkart.com/");
		
		
		
		Thread.sleep(3000);
		
		
		
		
	}
	
}
