package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class f5_testNG 
{
	Sheet sh;
	WebDriver driver;
	f1 a1;
	f2 a2;
	f3 a3;
	
	@BeforeClass
	public void tc1() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file =new FileInputStream("F:\\sheet3.xlsx");
		
		sh = WorkbookFactory.create(file).getSheet("flipnew");
		
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\new chromedriver.exe\\chromedriver.exe");
		
		
		 driver =new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		 a1=new f1(driver);
		 a2 =new f2(driver);
		 a3=new f3(driver);
	
	}
	
	@BeforeMethod
	public void tc2() throws InterruptedException
	{
		
		a1.inputa1username(sh.getRow(0).getCell(0).getStringCellValue());
		a1.inputa1password(sh.getRow(0).getCell(1).getStringCellValue());
		a1.clicka1login();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void tc3() throws InterruptedException
	
	{
		a2.samsungsearch(sh.getRow(0).getCell(2).getStringCellValue());
		a2.searchbutton();
		Thread.sleep(2000);
	}
	
	
	@AfterMethod
	public void tc4() throws InterruptedException
	{
		a3.checkratings();
		
		Thread.sleep(2000);
	}
	
	
	@AfterClass
	
	public void tc5()
	{
		
		driver.close();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
