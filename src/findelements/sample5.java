package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 
{

	
	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///E:/html/text.html");
	
	List<WebElement> all = driver.findElements(By.xpath("//input"));
	
	
	System.out.println(all.size());
	
	
	for(WebElement s:all)
	
	{
		
		s.sendKeys("akshaypawar");              //sendkeys
		Thread.sleep(500);
		
		
	}
	
	Thread.sleep(5000);
	
	
	
	for(WebElement w:all)       //clear
	
	{
		
		w.clear();
		Thread.sleep(500);
	}
	
	
	driver.quit();
	
	
	
	
	
	
	
}}
