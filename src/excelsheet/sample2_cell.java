package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample2_cell
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{

	
	
	FileInputStream f =new FileInputStream("F:\\sheet3.xlsx");
	
	
//	Sheet v = WorkbookFactory.create(f).getSheet("Sheet5");
//	
//	int rowindex = v.getLastRowNum();
//	
//	
//	for(int i=0; i<=rowindex;i++)
//	
//	{
//		String value = v.getRow(i).getCell(0).getStringCellValue();
//		
//		System.out.println(value);
//		
//	}
//	
	
	Sheet b = WorkbookFactory.create(f).getSheet("Sheet5");
	
	int r = b.getLastRowNum();
	
	for(int j=0;j<=r;j++)

	{
		String value1 = b.getRow(j).getCell(0).getStringCellValue();	
		
		System.out.println(value1);
	}
	
	
	
	
	
	
}
}
