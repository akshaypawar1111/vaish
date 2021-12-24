package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_with_DDF.k1;
import POM_with_DDF.k2;
import POM_with_DDF.k3;



public class kite_2 
{
	WebDriver driver;    
	Sheet tt;
	k1 loginpage;
	k2 submitpage;
	k3 homepage;
	//kite_home k;
	
	@BeforeClass
	public void login() throws EncryptedDocumentException, IOException
	{
		

		FileInputStream file=new FileInputStream("F:\\sheet3.xlsx");   //excell
		
		  tt = WorkbookFactory.create(file).getSheet("frame1"); 
		 
		
		
		System.setProperty("webdriver.chrome.driver",                  
				"E:\\new chromedriver.exe\\chromedriver.exe");
			
			
		 driver = new ChromeDriver();            //browser
			
			driver.get("https://kite.zerodha.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		 loginpage=new k1(driver);
		 submitpage =new k2(driver);
		 homepage =new k3(driver);	
		//  k=new kite_home(driver);
			
		
	}	
	
	
			@BeforeMethod
			public void loginpage()
			{
				
				
				loginpage.inputk1username(tt.getRow(0).getCell(0).getStringCellValue());
				loginpage.inputk2password(tt.getRow(0).getCell(1).getStringCellValue());
				loginpage.clickk3loginbutton();
				submitpage.inputk2pin(tt.getRow(1).getCell(0).getStringCellValue());
				submitpage.clickk2submitbutton();
				
				
			}
			
			@Test
			public void homepage11()
			{
				String exp = tt.getRow(0).getCell(0).getStringCellValue();
				
				String act=homepage.getkitehomepageuserid();
				 Assert.assertEquals(act, exp);
		
				
			}
			
			
			@AfterMethod
			public void logoutfromkite()
			{
				
				homepage.clickonuserID();
				homepage.logoutfromkite();
				
				
			}
			
			
		
	
	@AfterClass
	public void logout() throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		driver=null;
		homepage=null;
		submitpage=null;
		loginpage=null;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
