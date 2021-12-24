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

public class s4
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{

	FileInputStream file = new FileInputStream("F:\\sheet3.xlsx");
	
	Sheet pp = WorkbookFactory.create(file).getSheet("frame3");
	
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\new chromedriver.exe\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//un
    String un = pp.getRow(0).getCell(0).getStringCellValue();
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(un);
	
	//p
	
	String p = pp.getRow(0).getCell(1).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(p);
	
	//
	
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	
	String exp = pp.getRow(0).getCell(2).getStringCellValue();
	
	String act = driver.findElement(By.xpath("(//div[@class='exehdJ'])[1]")).getText();
	
	if(exp.equals(act))
	{
		
		System.out.println("pass");
	}
	
	else
	{
		
		System.out.println("fail");
	}
	
	
	
}
}
