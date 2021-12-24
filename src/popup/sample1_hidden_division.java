package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_hidden_division                   
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();          //hidden division popup    //no need to switch focus
		
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("akshay");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");
		
		
		
		               
		
		
		
		
}}
