package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample1_multi_cells 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{

	
	
	FileInputStream f =new FileInputStream("F:\\sheet3.xlsx");
	
	Sheet v = WorkbookFactory.create(f).getSheet("Sheet4");

  int cell = v.getRow(0).getLastCellNum()-1;
	
	for(int i=0; i<=cell;i++)
	
	{
		
		String value = v.getRow(0).getCell(i).getStringCellValue();
		
	System.out.print(value+"   ");
		
		
	}
	
	
	
	
}
}
