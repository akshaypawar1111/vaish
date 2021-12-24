package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample7
{
public static void main(String[] args) throws InterruptedException
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	Thread.sleep(2000);
	
	
	
	
	WebElement e=driver.findElement(By.xpath("//select[@id='multi-select']"));
	
	Select s=new Select(e);
	
	s.selectByIndex(3);
	
s.selectByValue("Texas");
	s.selectByVisibleText("Pennsylvania");
	
	
	
}
}
