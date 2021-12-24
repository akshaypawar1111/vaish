package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		
		//excel
		
		FileInputStream f =new FileInputStream("F:\\\\sheet3.xlsx");
		
		Sheet s = WorkbookFactory.create(f).getSheet("frame1");
		
		
		
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//un
		String un = s.getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
		
		//pass
		
		String p = s.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(p);
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		
		String x = s.getRow(1).getCell(0).getStringCellValue();		
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(x);
		
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		
		
		//get userID
		
		String exp = s.getRow(2).getCell(2).getStringCellValue();
		String act = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
		if(act.equals(exp))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
}}
