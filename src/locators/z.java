package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class z 
{
public static void main(String[] args) throws InterruptedException {
	
	
	
	
	System.setProperty("webdriver.chrome.driver",
			"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("akshay");
	
	
	Thread.sleep(3000);
	
	//driver.findElement(By.linkText("//a[text()='Create New Account']")).click();
	
	
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("akshay");
	
	
	//driver.findElement(By.partialLinkText("(//a[contains(@class,'_42ft ')])[3]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
