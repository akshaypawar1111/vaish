package customized_listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample2_arrow_down
{
	public static void main(String[] args) throws InterruptedException 
	{


		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));   //s1
		
		Actions aa=new Actions(driver);   //s2
		
		Thread.sleep(2000);
		aa.click(day).perform();  //s3
		
		//aa.sendKeys(Keys.ARROW_UP).perform();
		
		//aa.sendKeys(Keys.ARROW_DOWN).perform();
		
		aa.sendKeys(Keys.HOME).perform();   //s4
		
		Thread.sleep(2000);
		
		aa.sendKeys(Keys.ARROW_DOWN).perform();               //down
		
		aa.sendKeys(Keys.ENTER).perform();          //to select use ENTER key		
		
		
		
		
		//aa.sendKeys(Keys.ARROW_RIGHT).perform();
		
		
		
		
		
		
		
		
}}
