package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample5 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		
		WebElement s = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement d = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
		
		
		Actions aa =new Actions(driver);
		Thread.sleep(2000);
		
		aa.dragAndDrop(s, d).perform();
		
		//aa.moveToElement(s).clickAndHold().moveToElement(d).release();
		
		
		
		
		
		
		
		
}}
