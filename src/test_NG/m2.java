package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class m2 
{
	WebDriver driver;
	@Parameters("browsername")
	@Test
	public void tescase1(String browsername) {
	
	
	
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
			
		else if(browsername.equals("firefox"))
			
		{

			System.setProperty("webdriver.gecko.driver", 
					"E:\\new firefox driver\\geckodriver.exe");
			
			
			 driver=new FirefoxDriver();
		}
		
			
			
		
		
    driver=new ChromeDriver();
		
	driver.manage().window().maximize();
		
	driver.get("https://www.facebook.com/");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
