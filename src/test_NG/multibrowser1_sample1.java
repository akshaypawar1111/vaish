package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowser1_sample1 
{

	@Parameters("browsername")
	@Test
	public void tc1(String browsername)
	{
		 WebDriver driver= null;
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"E:\\new chromedriver.exe\\chromedriver.exe");
			
			
		 driver=new ChromeDriver();
			
		
			
			
		}
		else if(browsername.equals("opera"))
		{
			
			System.setProperty("webdriver.opera.driver", 
					"E:\\new opera driver\\operadriver_win64\\operadriver.exe");
			
			
			 driver=new OperaDriver();
			
			
		}
		else if(browsername.equals("Firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", 
					"E:\\new firefox driver\\geckodriver.exe");
			
			
			 driver=new FirefoxDriver();
			
			
		}
		
		driver.get("https://kite.zerodha.com/");
		
		
	}
	
	
}
