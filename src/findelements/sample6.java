package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6 
{

	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.cowin.gov.in/");
		
		
		List<WebElement> a = driver.findElements(By.xpath("//a"));
		
		System.out.println(a.size());
		
		
		
		for(WebElement alllinks:a)
		{
			String text = alllinks.getText();
			System.out.println(text);
			
		}
		
		driver.quit();
		
}}
