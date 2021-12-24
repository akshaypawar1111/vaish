package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo91
{
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		
		boolean p=driver.findElement(By.xpath("(//input[@name='sex'])[2]")).isSelected();
		
		System.out.println(p);
		
		if(p==true)
		{
			System.out.println("is selected");
		}
		else 
		{
			System.out.println("not selected");
		}
		
		
		
		
		
		
		
}
}