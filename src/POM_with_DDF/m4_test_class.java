package POM_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class m4_test_class 
{

	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		
		FileInputStream file = new FileInputStream("F:\\sheet3.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("frame1");
		
	
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\new chromedriver.exe\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
		
		m1 x =new m1(driver);
		
		x.inputm1username(sh.getRow(0).getCell(0).getStringCellValue());
		
		x.inputm1password(sh.getRow(0).getCell(1).getStringCellValue());
		
		x.clickm1loginbutton();
		
		
		
		m2 y  =new m2(driver);
		
		y.inputm2pin(sh.getRow(0).getCell(1).getStringCellValue());
		
		y.clickm2submitbutton();
		
		
		
		m3 z =new m3(driver);
		
		z.verifym3userID(sh.getRow(2).getCell(2).getStringCellValue());
		
		
		
		
		
		
		
		
		
		
	}
}
