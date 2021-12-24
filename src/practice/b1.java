package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b1 
{
public static void main(String[] args)
{

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.dmart.in/category/dmart-grocery-aesc-grocerycore2");
	
	driver.findElement(By.xpath("//button[text()='Register']")).click();
	
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("akshay");
	
	
	driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("78462556262");
	
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123456");
	
	boolean e = driver.findElement(By.xpath("(//i[@class='material-icons'])[3]")).isEnabled();
	
	System.out.println(e);
	
	if(e==true)
	{System.out.println("is enabled");
		}
	
	else
	{
		System.out.println("not enabled");
	}
	
	
	
	boolean s = driver.findElement(By.xpath("//input[@name='terms']")).isSelected();
	
	System.out.println(s);
	
	if(s==true)
	{
		System.out.println("checkbox is selected");
	}
	
	else
	{
		System.out.println("not selected");
	}
	
	driver.findElement(By.xpath("//input[@name='terms']")).click();
	
boolean f = driver.findElement(By.xpath("//input[@name='terms']")).isSelected();
	
	System.out.println(f);
	
	if(f==true)
	{
		System.out.println("checkbox is selected");
	}
	
	else
	{
		System.out.println("not selected");
	}
	
	
	driver.findElement(By.xpath("(//button[contains(@class,'src-client-components-auth-__common-module___link')])[2]")).click();
	
	
//	boolean d = driver.findElement(By.linkText("Sign In")).isDisplayed();
	
	//System.out.println(d);
	
	driver.findElement(By.xpath("//button[text()='New User? Create a account']")).click();
	
	WebElement p = driver.findElement(By.xpath("//input[@name='email']"));
	
	p.sendKeys("asdfghjkl");
	boolean d1 = p.isDisplayed();
	System.out.println(d1);
	
	if(d1==true)
	{
		System.out.println("is displayed");
	}
	else
	{
		System.out.println("not displaced");
	}
	
}
}
