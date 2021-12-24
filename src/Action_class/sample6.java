package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample6 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\\\\\\\new chromedriver.exe\\\\\\\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();	
	driver.manage().window().maximize();	
	
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	
	WebElement srcEle = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement destEle = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));

	Actions act=new Actions(driver);
	
	act.dragAndDrop(srcEle, destEle).perform();
		
	//act.moveToElement(srcEle).clickAndHold().moveToElement(destEle).release().build().perform();
	
}
}