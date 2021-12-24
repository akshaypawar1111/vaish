package dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4_iphone
{
public static void main(String[] args) throws InterruptedException 
{

	
	
	
	System.setProperty("webdriver.chrome.driver",

			"E:\\new chromedriver.exe\\chromedriver.exe");
	
	
	
	WebDriver driver=new ChromeDriver();    //((//div[@class='_3pLy-c row'])[1]//span)[4]
	
	driver.get("https://www.flipkart.com/");
	
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone SE");
	
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	//driver.findElement(By.xpath("//span[text()='APPLE iPhone SE (Black, 64 GB)']")).click();
	
	
	Thread.sleep(3000);
	WebElement ratings = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[1]"));
	
	Thread.sleep(3000);
	ratings.click();
	String text = ratings.getText();
	
	System.out.println(text);
	
	
	
	
	
	
	
	
}
}
