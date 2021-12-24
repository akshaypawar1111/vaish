package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample92_index
{
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
	
	
	
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("qwertyuiop");  //xpath index (expression)[index number]
	
	
	driver.findElement(By.xpath("(//select[contains(@class,'_9407 ')])[1]")).click();  //xpath index (expression)[index number]
	
	
	
	
	
}
}
