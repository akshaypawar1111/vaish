package Autosugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver",
			"E:\\new chromedriver.exe\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("toyota");
	
	String x="toyota fortuner";
	
	Thread.sleep(2000);
	
	
	List<WebElement> y = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//div"));
	
	
	System.out.println(y.size());
	
	Thread.sleep(3000);
	
	for(WebElement w1:y)
	
	{
		//System.out.println(w1.getText());
		String o = w1.getText();
		if(o.equals(x))
		{
			w1.click();
			break;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
