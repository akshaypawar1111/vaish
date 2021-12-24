package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b4_test_class
{
	public static void main(String[] args) 
	{

		
		
	System.setProperty("webdriver.chrome.driver",
			"E:\\new chromedriver.exe\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		b1 g=new b1(driver);
		g.un();
		g.pass();
		g.login();
		
		b2 v=new b2(driver);
		v.pin();
		v.submit();
		
		b3 x= new b3(driver);
		
		x.user();
		
		
		
		
		
		
}}
