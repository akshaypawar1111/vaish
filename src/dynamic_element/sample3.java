package dynamic_element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 
{



	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("oneplus");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		WebElement tt = driver.findElement(By.xpath("((//div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20'])[3]//span)[5]"));
		
		String o = tt.getText();
		
		System.out.println(o);
		
		
	}}
		