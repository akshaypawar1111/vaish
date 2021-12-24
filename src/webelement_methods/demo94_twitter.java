package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo94_twitter 
{

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.youtube.com/");
		
		//driver.findElement(By.partialLinkText("Sign ")).click();
		
		WebElement g = driver.findElement(By.xpath("//input[@name='search_query']"));
		
		
		g.sendKeys("abc");
		
		Thread.sleep(3000);
		
		g.clear();
		
		g.sendKeys("10% luck 20 % skill");
		
		//driver.findElement(By.xpath("//div[contains(@class,'ytd-searchbox-spt ')]")).click();
		//driver.findElement(By.partialLinkText("Remember ")).click();
		
		
		
		
		
		
		
		
}}
