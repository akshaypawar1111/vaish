package Autosugetions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z 
{
	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver",
				"E:\\new chromedriver.exe\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			//driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l ')])[1]")).click();
			
			
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("note 21 ultra");
			
			List<WebElement> a = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li[3]"));
			String b="note 21 ultra price";
			
			for(WebElement ff:a)
			{
				
				String text = ff.getText();
				System.out.println(text);
				
				
				if(text.equals(b))
				{
					
					
				}
			}
			
			
			
	
			
			
	
			
			
			
			
		
}}
