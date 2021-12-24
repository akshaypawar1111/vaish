package listbox;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a8 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	
	WebElement q = driver.findElement(By.xpath("//select[@id='select-demo']"));
	
	
	Select s=new Select(q);
	
	String text = s.getFirstSelectedOption().getText();
	
	System.out.println(text);
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
