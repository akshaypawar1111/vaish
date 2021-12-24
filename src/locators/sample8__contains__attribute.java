package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample8__contains__attribute 
{
public static void main(String[] args) throws InterruptedException 
{


	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//input[contains(@placeholder,'Email ')]")).sendKeys("akshaypawar1111");
	Thread.sleep(5000);
	
	driver.close();
}
}
