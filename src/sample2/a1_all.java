package sample2;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1_all
{
public static void main(String[] args) throws InterruptedException {

	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://coindcx.com/");     //get method - to open application in browser
	
	Thread.sleep(3000);
	
	String title=driver.getTitle();   //getTitle method- to get title of current browser
	
	System.out.println(title);
	
	String url = driver.getCurrentUrl();   //getCurrentUrl - to get url of current browser
	System.out.println(url);
	
	driver.manage().window().maximize();   // to maximize the size of browser
	
	Thread.sleep(3000);   // to wait for some time 
	
	driver.navigate().to("https://www.youtube.com/");   //navigate method- to open application/ url in browser and we can also perform actions like forward, backward, and refresh page
	
	Thread.sleep(3000);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	Dimension f=driver.manage().window().getSize();  // getSize - to get the size of browser
	System.out.println(f);
	
	
	Dimension d=new Dimension(500, 600); //setSize method - to change the size of the browser 
	driver.manage().window().setSize(d);
	
	Thread.sleep(3000);

	Point p1=driver.manage().window().getPosition();  //getPosition - to get the position of browser
	System.out.println(p1);
	
	
	Point p =new Point(700, 500);
	driver.manage().window().setPosition(p); //setPosition- to change/set position of the browser
	
	Thread.sleep(3000);
	
	
	
	
	driver.quit();  //closes all the tabs in browser
	
	
	
	
	
}
}
