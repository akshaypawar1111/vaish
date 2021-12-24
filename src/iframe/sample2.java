package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
		driver.switchTo().frame(0);  // index
		
		driver.findElement(By.xpath("//button[contains(text(),'Click ')]")).click();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("(//a[contains(@class,'w3')])[8]")).click();
		
		
		
		
		
		
		
		
		
		
}}
