package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9_all 
{

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	
	WebElement p=driver.findElement(By.name("firstName"));
	
	Thread.sleep(3000);
	p.sendKeys("pawar");
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	
	Dimension f=new Dimension(500, 600);
	driver.manage().window().setSize(f);
	Thread.sleep(3000);
	driver.manage().window().maximize();
	p.clear();
	Thread.sleep(3000);
	
	Point g=driver.manage().window().getPosition();
	System.out.println(g);
	
	
	System.out.println(driver.findElement(By.linkText("Terms")).isEnabled());
	
	
	
	
	System.out.println(driver.findElement(By.xpath("//span[text()='Use my current email address instead']")).getText());
	
	boolean b=driver.findElement(By.xpath("(//span[contains(@class,'VfPpkd')])[3]")).isDisplayed();
	System.out.println(b);
	
	if (b==true)
			{
		System.out.println("is displayed");
		
			}
	else
	{
		System.out.println("is not displayed");
	}
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}