package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a8 
{

	public static void main(String[] args)
	{

		

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		
		driver.get("file:///E:/html/all.html");
		
		driver.findElement(By.id("akshay")).sendKeys("akshay_pawar");
		driver.findElement(By.id("12345")).sendKeys("12345678910");
		
		
		driver.findElement(By.partialLinkText("Web")).click();
		
		
}
}