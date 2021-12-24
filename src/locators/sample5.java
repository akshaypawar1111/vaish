package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium software\\chromedriver.exe");	

WebDriver driver=new  ChromeDriver();

driver.get("https://www.facebook.com/login/");

driver.findElement(By.xpath("//input[@type='text']")).sendKeys("acbcefg");

driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");

driver.findElement(By.xpath("//button[@name='login']")).click();









}
}
