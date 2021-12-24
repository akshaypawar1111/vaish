package POM_DDF_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass
{

	public static String getexcell(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
	{
		

		FileInputStream file=new FileInputStream("F:\\sheet3.xlsx");   //excell
		
		  Sheet tt = WorkbookFactory.create(file).getSheet("frame1"); 
		 
		String value = tt.getRow(rowindex).getCell(cellindex).getStringCellValue();
		  
		return value;
		
		
	}
	
	
	public static void screenshot(WebDriver driver, int testID) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti =new File("F:\\selenium screenshort\\testclass1"+testID+".jpg");
		
		 FileHandler.copy(src, desti);
		
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
