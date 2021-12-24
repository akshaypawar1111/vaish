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

public class f4_test
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
{

	
	FileInputStream file =new FileInputStream("F:\\sheet3.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("flipnew");
	
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\new chromedriver.exe\\chromedriver.exe");
	
	
	WebDriver driver =new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	f1 q =new f1(driver);
	
	q.inputa1username(sh.getRow(0).getCell(0).getStringCellValue());
	q.inputa1password(sh.getRow(0).getCell(1).getStringCellValue());
	q.clicka1login();
	
	Thread.sleep(2000);
	
	
	f2 x =new f2(driver);
	x.samsungsearch(sh.getRow(0).getCell(2).getStringCellValue());
	x.searchbutton();
	
	f3 v=new f3(driver);
	v.checkratings();
	
	
}
}
