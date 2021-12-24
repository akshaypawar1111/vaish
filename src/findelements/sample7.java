package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample7 
{
	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///E:/html/checkbox.html");
		
		
		List<WebElement> qq = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		System.out.println(qq.size());
		
		
		for(int i=qq.size()-1;i>=0;i--)
		{
			qq.get(i).click();
			Thread.sleep(500);
			
		}
		
		Thread.sleep(5000);
		for(WebElement e:qq)
		{
			
			e.click();
			Thread.sleep(500);
		}
		driver.close();
		
}}
