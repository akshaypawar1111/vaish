package POM_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class z4_testclass 
{

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		
		FileInputStream file = new FileInputStream("F:\\sheet3.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("frame2");
		
	
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\new chromedriver.exe\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
	
	z1 a1=new z1(driver);
	
	a1.un(sh.getRow(0).getCell(0).getStringCellValue());
	a1.pass(sh.getRow(0).getCell(1).getStringCellValue());
	a1.login();
	
	
	z2 a2=new z2(driver);

	a2.pinenter(sh.getRow(0).getCell(2).getStringCellValue());
	a2.submitbutton();
	
	
	z3 a3=new z3(driver);
	a3.verifyuserid(sh.getRow(0).getCell(3).getStringCellValue());
	a3.clickonuser();
	a3.logoutuser();
	
	
	
	
	}
	
}
