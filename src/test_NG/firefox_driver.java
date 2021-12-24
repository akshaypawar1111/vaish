package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class firefox_driver
{

		

		public static void main(String[] args) 
		{
		
			
			
			System.setProperty("webdriver.gecko.driver", 
					"E:\\new firefox driver\\geckodriver.exe");
			
			
			WebDriver driver=new FirefoxDriver(); 
			
			
			driver.get("https://kite.zerodha.com/");
			
			
			
			
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		

}
