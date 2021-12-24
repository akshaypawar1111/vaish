package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a2_selectclassmethods
{
	public static void main(String[] args) throws InterruptedException
	{

		
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");

	 WebDriver driver =new ChromeDriver();
	 
	 driver.get("https://en-gb.facebook.com/");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
	 
	 WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	 
	Select s=new Select(day);
	 
	 s.selectByValue("21");
	 
//	String text = s.getFirstSelectedOption().getText();
//	 
//	 System.out.println(text);
	 
	 
	 
	 
}
}
