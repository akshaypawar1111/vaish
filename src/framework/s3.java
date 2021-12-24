package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		
		//excel
		
		FileInputStream f =new FileInputStream("F:\\\\sheet3.xlsx");
		
		Sheet s = WorkbookFactory.create(f).getSheet("frame2");
		
		
		
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//un
		String un = s.getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
		
		//pass
		
		String pass = s.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		
		//submit
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//pin
		String pin = s.getRow(0).getCell(2).getStringCellValue();
		
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		
		//continue
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		String exp_userid = s.getRow(0).getCell(3).getStringCellValue();
		
		
		String actual = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
		
		if(actual.equals(exp_userid))
		
		{
			
			System.out.println("pass");
		}
		
		else 
		{
			System.out.println("fail");
		}
		
		

	}}
