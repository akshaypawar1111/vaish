package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo93 
{
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("AKSHAY PAWAR");
		
		
		WebElement radio=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		
		boolean male=radio.isSelected();
		
		
		if(male==true)
		
		{
			System.out.println("radio button selected");
		}
		else
		{
			System.out.println("radio button NOT selected");
		}
		
		System.out.println("..................................................................");
		
		Thread.sleep(3000);
		radio.click();
		Thread.sleep(3000);
		
		boolean male1=radio.isSelected();
		
		if(male1==true)
		{
			System.out.println("radio button selected successfully");
			
			
		}
		else
		{
			System.out.println("radio button NOT selected");
		}
		
}
}