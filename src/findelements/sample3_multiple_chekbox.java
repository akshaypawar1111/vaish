package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3_multiple_chekbox 
{
	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///E:/html/checkbox.html");
		
		List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
	
		
		
		System.out.println(all.size());
		
		for(WebElement checkall:all)
		
		{
			
			checkall.click();
			
			Thread.sleep(1000);
		}
		
		
		
}}
