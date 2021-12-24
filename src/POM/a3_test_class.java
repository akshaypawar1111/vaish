package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3_test_class 
{

		
		public static void main(String[] args) 
		{

			
			
		System.setProperty("webdriver.chrome.driver",
				"E:\\new chromedriver.exe\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		a1 qq= new a1(driver);
		qq.username();
		qq.password();
		qq.log();
		
		a2 f=new a2(driver);
		f.mobiles();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
