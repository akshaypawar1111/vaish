package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample2_rightclick 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
	
		
		driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l ')])[1]")).click();
		
		
		
		//a.contextClick().perform();       //by default when when right click then action performs on top lest corner
		
		
		WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		
		a.contextClick(cart).perform();
		
		
		
		
		
		
		
		
}}
