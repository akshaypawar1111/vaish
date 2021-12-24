package Autosugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import practice.a1;

public class sample4 
{
public static void main(String[] args) throws InterruptedException 
{

	
	System.setProperty("webdriver.chrome.driver",
			"E:\\new chromedriver.exe\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hyundai");
	String w =" hyundai alcazar";
	
    Thread.sleep(2000); 
	
	List<WebElement> y = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//b"));
	
	System.out.println(y.size());
	
// String w =" alcazar";
	
	for(WebElement k:y)
	
	{
		
		String r = k.getText();
		if(r.equals(w))
		{
			k.click();
			break;
		}
		
	
		
	}
	
	
	
}
}
