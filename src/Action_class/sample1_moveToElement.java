package Action_class;

import org.apache.xml.security.stax.ext.XMLSecurityConstants.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample1_moveToElement
{
public static void main(String[] args) throws InterruptedException       //moveToElement()
{
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	
	
	driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l ')])[1]")).click();
	
	Thread.sleep(2000);
	
	WebElement p = driver.findElement(By.xpath("//a[text()='Login']"));    // step1   identify the dropdown and store it in one object
	
	
	Actions a =new Actions(driver);    //step 2   create the object of action class which accept webdriver input
	Thread.sleep(2000);
	a.moveToElement(p).perform();      //step3      call the action class method
	
	
	
	
	
	
	
	
	
}
}
