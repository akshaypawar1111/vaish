package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a1_selectclassmethods
{
public static void main(String[] args) throws InterruptedException
{

	
System.setProperty("webdriver.chrome.driver", 
		"E:\\new chromedriver.exe\\chromedriver.exe");

 WebDriver driver =new ChromeDriver();
 
 driver.get("https://en-gb.facebook.com/");
	
	//click on create new acc link
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
	Thread.sleep(2000);
	
	//Step1: 
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	//step2: 
	Select s=new Select(month);
	
	//step3:
	s.selectByVisibleText("Aug");            //String input
	//s.selectByValue("8");						//String input
	//s.selectByIndex(1);
	
}
	
	
}
