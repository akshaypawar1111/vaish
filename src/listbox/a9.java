package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a9 
{
	public static void main(String[] args) throws InterruptedException
	{

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
	
	WebElement t=driver.findElement(By.xpath("//select[@id='day']"));
		
		
		Select s=new Select(t);
		
	
		s.selectByIndex(10);
		
	String text = s.getFirstSelectedOption().getText();
		
		System.out.println(text);
		
		
		
		
		
}}
