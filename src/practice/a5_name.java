package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a5_name
{
	public static void main(String[] args)
	{

		

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///E:/html/name.html");
		
		
		driver.findElement(By.name("nikhil")).sendKeys("NIKHIL");
		
		
		driver.findElement(By.name("nikhil")).sendKeys("451");
		
}
}