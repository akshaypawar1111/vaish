package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s1_without_data_driven                           //
{

	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
		
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		
		//get userID
		String tt = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
		String actualid = "DV1510";
		
		
		
		if(actualid.equals(tt))
		{
			
			System.out.println("Pass");
		}
		
		else
		{
					System.out.println("fail");
	}
		
		
		Thread.sleep(2000);
		driver.close();
	
}}
