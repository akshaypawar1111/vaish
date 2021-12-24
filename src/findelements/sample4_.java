package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4_ 
{
	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///E:/html/checkbox.html");
		
		
		List<WebElement> p = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		System.out.println(p.size());
		
		for(WebElement all:p)
		
		{
			all.click();
			Thread.sleep(1000);
			
			
			
		}
		
		
//		for(int i=8; i>=0;i--)            //    to select from bottom
//		{
//			
//			p.get(i).click();
//			Thread.sleep(1000);
//		}
//		
		
		
		Thread.sleep(4000);
		
		for(WebElement q1:p)                  //to deselect
			
		{
			
			q1.click();   
			Thread.sleep(1000);
			
		}
		
		driver.close();
	
		
		
		
		
}}
