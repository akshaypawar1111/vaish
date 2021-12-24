package Autosugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5
{
	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver",
				"E:\\new chromedriver.exe\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.ajio.com/?gclid=Cj0KCQjwiNSLBhCPARIsAKNS4_fk-AznpdZk_kSpPHCv0RyLK_VsURiamxn9lwFaP5EQgFqp76dDSs8aAlVVEALw_wcB");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jack");
			Thread.sleep(1000);
			
			String s="jack & jones in ";
			
			
			List<WebElement> o = driver.findElements(By.xpath("//ul[@class='rilrtl-list ']//a"));
			
			
			System.out.println(o.size());
			
			
			
			
			
			
			
			
			
}}
