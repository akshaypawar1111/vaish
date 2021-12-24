package dynamic_element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", 
			"E:\\new chromedriver.exe\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mi tv");
	
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	WebElement tt = driver.findElement(By.xpath("(//div[@class='_3pLy-c row']//span)[13]"));
	
        tt.click();
	String text = tt.getText();
	
	
	System.out.println(text);
	
	
	
	
}
}
