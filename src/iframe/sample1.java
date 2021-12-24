package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");         //String  frame ID         //this function will switch selenium focus from main page to iframe
		
	//driver.switchTo().frame();            //int frame index
		
		//driver.switchTo().frame("iframeResult");             //String frame Name

			driver.findElement(By.xpath("//button[contains(text(),'Click ')]")).click();
			
			Thread.sleep(2000);
			
			driver.switchTo().defaultContent();       //this function is used to navigate from iframe to main page
			
		//	driver.switchTo().parentFrame();         //this function is used to navigate from iframe to main page
			                                               //(from child frame to immediate parent)
			
			
			
			
			
			driver.findElement(By.xpath("//a[@id='tryhome']")).click();
			
			
			
			
			
			
			//driver.switchTo().defaultContent();
		
		
		
		
		
	}
}
