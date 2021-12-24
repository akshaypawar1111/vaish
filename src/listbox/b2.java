package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class b2 
{
public static void main(String[] args) throws InterruptedException 
{

	
	System.setProperty("webdriver.chrome.driver",
                    "E:\\\\new chromedriver.exe\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://en-gb.facebook.com/");
	
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);
	
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	
	Select s =new Select(month);
	
	List<WebElement> all = s.getOptions();
	
	for(WebElement a:all)
	
	{
		System.out.println(a.getText());
	}
	
	System.out.println("................size..........");
	
	
	
	System.out.println(s.getOptions().size());
	
	
	
	
	
}
}
