package dynamic_element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver",
			"E:\\new chromedriver.exe\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("note 20 ultra");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
		                                                      //parent                      //child
		
		 WebElement rating = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[4]"));   //identify the element ...navigate to parent then navigate to child(//) and identify the element which we want to select
		
		 
		 Thread.sleep(3000);
		rating.click();
		 
		System.out.println(rating.getText());
		
		
		
		
}}
