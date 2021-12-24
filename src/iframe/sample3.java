package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
		driver.switchTo().frame("iframeResult");  //framename
		
		driver.findElement(By.xpath("//button[contains(text(),'Click ')]")).click();
		
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
		
		
		
		
		
		
		
		
		
}}