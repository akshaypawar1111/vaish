package customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample1_arrow_up
{
public static void main(String[] args) throws InterruptedException        //to handle customizable listbox we need to mske use of actions and keys class
{


	System.setProperty("webdriver.chrome.driver", 
			"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Actions aa=new Actions(driver);
	//Thread.sleep(1000);
	aa.click(month).perform();      
	
	
	
	aa.sendKeys(Keys.ARROW_UP).click().perform();
	
	
	
	
	
	
	
	
}
}
