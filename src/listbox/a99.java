package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a99
{
	public static void main(String[] args) throws InterruptedException
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///E:/html/sample6_multiplecountry.html");
		
		
		Thread.sleep(3000);
		
		
		WebElement multi = driver.findElement(By.xpath("//select[@id='1234']"));
		Thread.sleep(3000);
		
		Select s=new Select(multi);
		
		
		s.selectByVisibleText("INDIA");
		s.selectByIndex(1);
		
	String i = s.getFirstSelectedOption().getText();
		
		System.out.println(i);
	
		
		
		
}}
