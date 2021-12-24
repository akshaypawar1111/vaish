package POM_DDF_BC_UC_propertyClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;






public class utilityclass222
{

	public static String exceINFO(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("F:\\sheet3.xlsx");
		
		
		Sheet cc = WorkbookFactory.create(file).getSheet("frame1");
		
		String info = cc.getRow(rowindex).getCell(cellindex).getStringCellValue();
		
		return info;
	}
	
	
	
	public static void capturescreenshot(WebDriver driver, int testcaseID) throws IOException
	{
		
		
  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File exp=new File("F:\selenium screenshort\\testclass2"+testcaseID+".jpg");
		
FileHandler.copy(src, exp);
		
	}
	
	public static String getdatafromPF(String key) throws IOException
	{
		FileInputStream ff=new FileInputStream("C:\\Users\\AKSHAY\\eclipse-workspace\\Selenium\\propertyFile_pom_ddf_bc_uc_pf.properties");
		
		Properties p=new Properties();
		
		p.load(ff);                      //it will load the data
		String ur = p.getProperty(key);          //to get the loaded data
		
		return ur;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
