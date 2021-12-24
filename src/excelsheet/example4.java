package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	
	FileInputStream file=new FileInputStream("F:\\sheet3.xlsx");
	
	
	double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	
	//double value1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
	
	
	System.out.println(value);
	
	//System.out.println(value1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
