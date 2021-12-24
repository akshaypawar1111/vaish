package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{

	
	FileInputStream f=new FileInputStream("C:\\Users\\AKSHAY\\eclipse-workspace\\sheet2.xlsx");
	
	
	String v = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
	
	System.out.println(v);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
