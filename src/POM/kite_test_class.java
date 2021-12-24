package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite_test_class                    
{
public static void main(String[] args)
{

	
	
System.setProperty("webdriver.chrome.driver",
		"E:\\new chromedriver.exe\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//1
	kite_login_page1 p1=new kite_login_page1(driver);
	
	p1.username();
	p1.password();
	p1.loginbutton();
	
	//2
	kite_login_page2 p2=new kite_login_page2(driver);
	
	p2.pin();
	p2.sumbitbutton();
	
	
	//3
	
	kite_page3_home p3=new kite_page3_home(driver);
	
	p3.homepg();
	
	
	
	
	
	
	
}
}
