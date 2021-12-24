package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class b5_ALL 
{
	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver",
	                    "E:\\\\new chromedriver.exe\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://secure.indeed.com/account/register?hl=en_US&co=US&service=my&continue=https%3A%2F%2Fwww.indeed.com%2F");
		
		driver.findElement(By.xpath("//input[@name='__email']")).sendKeys("akshay");
		
		//boolean a = driver.findElement(By.xpath("//span[text()='Employer']")).isSelected();
		//System.out.println(a);
		
		   WebElement e= driver.findElement(By.xpath("//span[text()='Employer']"));
		   e.click();
		   boolean is = e.isEnabled();
		System.out.println(is);
		
		WebElement p = driver.findElement(By.xpath("//span[@class='icl-Checkbox-controlIndicator icl-Checkbox--sm']"));
		
		p.click();
		boolean q = p.isSelected();
		System.out.println(q);
		
		
		
		
		

//		WebElement l = driver.findElement(By.xpath("//span[@id='select-1']"));
//		
//		
//		Select s =new Select(l);
//		
//		String first = s.getFirstSelectedOption().getText();
//		
//		
//		System.out.println(first);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}

