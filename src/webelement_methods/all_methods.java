package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_methods
{
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		String c=driver.getTitle();
		System.out.println(c);             //getTitle
		
		
		String z=driver.getCurrentUrl();
		System.out.println(z);                //getCurrentUrl
		 
		
		
	
		
		
	WebElement p=driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
		
		p.sendKeys("akshaypawar");  //sendkeys
		
		Thread.sleep(2000);
		driver.manage().window().maximize();    //maximize
		Thread.sleep(4000);
		
		Dimension q=driver.manage().window().getSize();
		System.out.println(q);                             //getSize
		
		p.clear();           //clear
	Thread.sleep(2000);
	
	Point f=driver.manage().window().getPosition();
	System.out.println(f);                                        //getPosition
	
	Dimension s=new Dimension(500, 600);
	driver.manage().window().setSize(s);    //setSize
	Thread.sleep(2000);
		
		p.sendKeys("PAWAR");
		
		Point a= new Point(400, 500);
		driver.manage().window().setPosition(a);            //setPosition
	
		Thread.sleep(4000);
		
		driver.manage().window().maximize();    //maximize
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123456789");
	Thread.sleep(2000);
		
		boolean o = driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).isSelected();   //isSelected
		
		//System.out.println(o);
		
		if(o==true)
		{
			System.out.println("checkbox selected ");
		}
		
		else
		{
			System.out.println("checkbox not selected");
		}
		
		
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("i3")).click();
		Thread.sleep(2000);
		
	boolean k = driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).isSelected();  //isSelected
		
		//System.out.println(k);
	if(k==true)
	{
		System.out.println("checkbox selected ");
	}
	
	else
	{
		System.out.println("checkbox not selected");
	}
		
		
		
		System.out.println(driver.findElement(By.xpath("//span[text()='Next']")).getText());  //getText
		
		driver.findElement(By.xpath("//span[text()='Sign in instead']")).click();
		Thread.sleep(2000);
		
	System.out.println(driver.findElement(By.xpath("//button[text()='Forgot email?']")).isEnabled());  //isEnabled
	Thread.sleep(2000);
	
	boolean j=driver.findElement(By.xpath("//span[text()='Create account']")).isDisplayed();        //isDisplayed
	System.out.println(j);
		
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='For myself']")).click();
		
		driver.quit();     //quit()
		
}
}