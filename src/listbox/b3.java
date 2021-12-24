package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class b3 
{
	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver",
	                    "E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://en-gb.facebook.com/");
		
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		
		Select s =new Select(year);
System.out.println("..........size...............");
		
		int size = s.getOptions().size();
		
		System.out.println(size);
		
		System.out.println("................................................");
		
		
		List<WebElement> all = s.getOptions();
		
		for(WebElement z:all)
		
		System.out.println(z.getText());
		
		
		
}}
