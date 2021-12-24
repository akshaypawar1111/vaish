package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample3_Rightclick
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		
		Actions aa=new Actions(driver);
		Thread.sleep(2000);
		
		aa.click(mobile).perform();
		
		//aa.moveToElement(mobile).click().build().perform();            //alternative
		
		
		
		
		
		
		
		
		
}}
