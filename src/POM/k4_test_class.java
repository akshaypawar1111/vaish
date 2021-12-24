package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class k4_test_class 
{
public static void main(String[] args) 
{

	
	
System.setProperty("webdriver.chrome.driver",
		"E:\\new chromedriver.exe\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	k1 a=new k1(driver);          //object creation of POM class1
	
	a.user();
	a.pass();
	a.login();
	 
	k2 b=new k2(driver);             //object creation of POM class2
	b.pin();
	b.conti();
	
	k3 c=new k3(driver);             //object creation of POM class3
	c.id(); 
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
