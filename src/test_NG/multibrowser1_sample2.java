package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowser1_sample2 
{

	@Parameters("browserName")
	@Test
	public void testcase1(String browserName) throws InterruptedException
	{
		
		
	WebDriver driver=null;
if(browserName.equals("Chrome"))
	
{
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\new chromedriver.exe\\chromedriver.exe");
	
	 driver=new ChromeDriver();
}
	

else if(browserName.equals("msedge")) {

System.setProperty("webdriver.edge.driver", 
		"E:\\new edge driver\\msedgedriver.exe");
		
 driver=new EdgeDriver();


	}
else if(browserName.equals("Opera")) 
{

System.setProperty("webdriver.opera.driver", 
		"E:\\new opera driver\\operadriver_win64\\operadriver.exe");
		
driver=new OperaDriver();


	}
	

	

		driver.get("https://coindcx.com/");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
