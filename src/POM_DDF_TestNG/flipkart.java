package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_with_DDF.a1;
import POM_with_DDF.a2;

public class flipkart
{
	WebDriver	 driver;
	Sheet tt;
	a1 loginpage;
	a2 homepage;
	
	
	@BeforeClass
	public void tc1() throws EncryptedDocumentException, IOException
	{

		FileInputStream file=new FileInputStream("F:\\sheet3.xlsx");   //excell
		
	tt = WorkbookFactory.create(file).getSheet("frame3"); 
		 
		
		
		System.setProperty("webdriver.chrome.driver",                  
				"E:\\new chromedriver.exe\\chromedriver.exe");
			
			
	 driver = new ChromeDriver();            //browser
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			
			
			 loginpage=new a1(driver);
			 homepage =new a2(driver);
			
		
		
	}
	
	
	
	@BeforeMethod
	public void login()
	{
		
		loginpage.inputa1username(tt.getRow(0).getCell(0).getStringCellValue());
		loginpage.inputa1password(tt.getRow(0).getCell(1).getStringCellValue());
		loginpage.clicka1login();
		
		
	}
	
	@Test
	public void home() throws InterruptedException
	{
		
	
		
		homepage.mobile();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
