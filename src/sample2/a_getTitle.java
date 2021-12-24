package sample2;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_getTitle 
{
public static void main( String     args[])
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	
	        String title = driver.getTitle();  //return type of get title is string
	
	System.out.println(title);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
