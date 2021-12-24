package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class z3_test
{
public static void main(String[] args) {
	
	
	
	System.setProperty("webdriver.chrome.driver", "");
	
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	z1 a = new z1(driver);
	
	a.inputusernamez1();
	a.inputpasswordz1();
	a.clickloginbuttonz1();
	
	
	z2 b =new z2(driver);
	
	b.clickokbutton();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
