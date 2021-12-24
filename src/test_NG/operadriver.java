package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class operadriver 
{

	
	public static void main(String[] args) 
	{
	
		
		
		System.setProperty("webdriver.opera.driver", 
				"E:\\new opera driver\\operadriver_win64\\operadriver.exe");
		
		
		WebDriver driver=new OperaDriver();
		
		
		driver.get("https://kite.zerodha.com/");
		
		
		
		
		
	}
	

	
	
}
