package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	
	FileInputStream file=new FileInputStream("F:\\sheet3.xlsx");
	
	
	double v1 = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(1).getNumericCellValue();
	
	
	System.out.println(v1);
	
	
	
	//boolean value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(3).getCell(2).getBooleanCellValue();
	
	//System.out.println(value);
	
	
	
	
}
}
