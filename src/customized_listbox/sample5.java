package customized_listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample5 
{
	public static void main(String[] args) throws InterruptedException 
	{


		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Actions a= new Actions(driver);
		
		a.click(year).click();
		Thread.sleep(2000);
		
		a.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		
		a.sendKeys(Keys.HOME).perform();
		
		Thread.sleep(3000);
		
		for(int i=1; i<=26;i++)
		
		{
			
			a.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
		
		
		
		
		
		
		
		
}}
