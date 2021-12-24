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

public class k4_test_class
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		
		FileInputStream file=new FileInputStream("F:\\sheet3.xlsx");
		
		Sheet tt = WorkbookFactory.create(file).getSheet("frame1");
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\new chromedriver.exe\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
	k1 a1=new k1(driver);
	
	String st = tt.getRow(0).getCell(0).getStringCellValue();
	
	a1.inputk1username(st);
	
	
	a1.inputk2password(tt.getRow(0).getCell(1).getStringCellValue());
	
	a1.clickk3loginbutton();
		
		
		k2 a2 =new k2(driver);
		
		a2.inputk2pin(tt.getRow(1).getCell(0).getStringCellValue());
		
		
		a2.clickk2submitbutton();
		
		
		k3 a3=new k3(driver);
		
		a3.verifyk3userid(tt.getRow(0).getCell(0).getStringCellValue());
		
		
		
		
		
		
		
	}
}
