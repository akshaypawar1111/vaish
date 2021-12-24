package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example7 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{

	
	
	FileInputStream f=new FileInputStream("F:\\sheet3.xlsx");
	
	
	double v1 = WorkbookFactory.create(f).getSheet("Sheet3").getRow(1).getCell(1).getNumericCellValue();
	
	
	System.out.println(v1);
	
	
	
	
	
	
}
}
