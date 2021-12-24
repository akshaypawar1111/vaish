package sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.jio.com/selfcare/login/");
	
	String actTitle = driver.getTitle();
	
	String expTitle = "jio.com";
	
	
	if(actTitle.equals(expTitle))
	{
		
		System.out.println("pass");
	}
	
	else
	{
		System.out.println("fail");
	}
	
	
	
	
}
}
