package Autosugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3
{
public static void main(String[] args) throws InterruptedException 
{
	
System.setProperty("webdriver.chrome.driver",
		"E:\\new chromedriver.exe\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung");
	
	String exp="samsung s21";
	
Thread.sleep(2000);
	
	
	List<WebElement> p = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
	
	System.out.println(p.size());
	
	
	for(WebElement q1:p)
	
	{
		
		System.out.println(q1.getText());
		
		
		
		
	}
	
}
}
