package Autosugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class sample1
{
public static void main(String[] args) throws InterruptedException 
{
	
System.setProperty("webdriver.opera.driver",
		"E:\\\\new opera driver\\\\operadriver_win64\\\\operadriver.exe\\\\");
	
	
	WebDriver driver=new OperaDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung");
	
	String exp="samsung s21";
	
Thread.sleep(2000);
	
	
	List<WebElement> p = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));     // /tagname
	
	
	System.out.println(p.size());      //to get size
	
	
	for(WebElement q1:p)
	
	{
		
		String act = q1.getText();
		System.out.println(act);
		
		if(act.equals(exp))
		{
			q1.click();
			break;
		}
		
	}
	
}
}
