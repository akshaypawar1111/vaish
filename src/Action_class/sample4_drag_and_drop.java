package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample4_drag_and_drop 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));  //1st identify the source and store it in onr object
		
		
		WebElement desti = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));   //1st identify the destination and store it in onr object
		
		
		Actions s=new Actions(driver);
		//Thread.sleep(2000);
		
		s.dragAndDrop(source, desti).perform();
		
		
		
		
		
		
}}
