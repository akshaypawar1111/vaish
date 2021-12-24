package sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b1_title_url 
{
public static void main(String[] args)
{

	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();


	
       driver.get("https://www.Google.com/");
	
	
	            String title = driver.getTitle();
	            System.out.println(title);
	
	           String url = driver.getCurrentUrl();
	           System.out.println(url);
	
	
}
}


  


