package POM_DDF_BaseClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.opera.OperaDriver;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;

public class baseclass_2 
{
	
	 WebDriver driver;
	
	 public void browsercode()

	{
	System.setProperty("webdriver.chrome.driver", 
			"E:\\new chromedriver.exe\\chromedriver.exe");
	
	
    driver =new ChromeDriver();
	
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}}























//WebDriver driver;
	// @Parameters("browsername")
	// @Test
	// public void browsercode()
//public void browsercode(String browsername)
//{
//	if(browsername.equals("Chrome"))
//	{
//	System.setProperty("webdriver.chrome.driver", 
//			"E:\\new chromedriver.exe\\chromedriver.exe");
//	
//	
//   driver =new ChromeDriver();
//	
//	
//	driver.get("https://kite.zerodha.com/");
//	
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//}
	
//else if(browsername.equals("msedge"))
		
//	{
//
//System.setProperty("webdriver.edge.driver", 
//		"E:\\new edge driver\\msedgedriver.exe");
//		
//driver=new EdgeDriver();
//driver.get("https://kite.zerodha.com/");
//	
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		
//	}
//else if(browsername.equals("Opera"))
//{
//
//System.setProperty("webdriver.opera.driver", 
//		"E:\\new opera driver\\operadriver_win64\\operadriver.exe");
//		
//driver=new OperaDriver();
//driver.get("https://kite.zerodha.com/");
//
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//
//
//
//}
//}

