package customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample7_amazon
{

	public static void main(String[] args) throws InterruptedException 
	{


		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/s?k=oneplus&ref=nb_sb_noss_2");
		
		
		WebElement dd = driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']"));
		
		
		Actions a =new Actions(driver);
		
		a.click(dd).perform();
		
		
		
		a.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		a.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		
		
}}
