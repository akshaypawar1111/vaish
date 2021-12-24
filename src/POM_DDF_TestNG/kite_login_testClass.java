package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
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


public class kite_login_testClass 
{

	
	k1 login;
	k2 submit;
	kite_home homepage;
	Sheet tt;
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	
	{
		

		FileInputStream file=new FileInputStream("F:\\sheet3.xlsx");
		
		 tt = WorkbookFactory.create(file).getSheet("frame1");
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\new chromedriver.exe\\chromedriver.exe");
			
			
		driver=new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			
		login=new k1(driver);
		 submit=new k2(driver);
	
		 
		homepage=new kite_home(driver);
			
		
		
		
	}
	
	
	
	
	
	@BeforeMethod
	public void loginpage() throws InterruptedException
	{
		
		login.inputk1username(tt.getRow(0).getCell(0).getStringCellValue());		
		login.inputk2password(tt.getRow(0).getCell(1).getStringCellValue());
		login.clickk3loginbutton();
		
		submit.inputk2pin(tt.getRow(1).getCell(0).getStringCellValue());
		submit.clickk2submitbutton();
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void verifyuserID()
	{
		
		String act = homepage.getkitehomepageuserid();
		
		String exp = tt.getRow(2).getCell(2).getStringCellValue();
		
		Assert.assertEquals(act, exp);
		
		
		
	}
	
	

	@AfterMethod
	public void logout()
	{
		
		
		homepage.clickonuserID();
		homepage.logoutfromkite();
		
		
		
	}
	
	
	
	

	@AfterClass
	public void Closebrowser() throws InterruptedException
	
	{
		Thread.sleep(2000);
		driver.close();
		driver=null;        //we do this because whatever the memory is allocated to class after doing this this memory will be released
		tt=null;
		login=null;
		homepage=null;
		submit=null;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
