package scroll_;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class sample2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.opera.driver", 
				"E:\\new opera driver\\operadriver_win64\\operadriver.exe\\");
		
		
		WebDriver driver=new OperaDriver();
	
	
	driver.get("http://demo.guru99.com/test/guru99home/");
	
	
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
