package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 {
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		Alert q = driver.switchTo().alert();
		
	
		
		q.dismiss();    //to click on cancel button
	//	q.accept();      //to click on ok button
		
		
}}
