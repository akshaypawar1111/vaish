package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class t1_getcelltype
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{

	FileInputStream file=new FileInputStream("F:\\sheet3.xlsx");
	
	
 Cell w = WorkbookFactory.create(file).getSheet("Sheet12").getRow(2).getCell(1);
	
	 CellType value = w.getCellType();           //string type
	
	 
	System.out.println(value);
	
	
//	CellType val = w.getRow(1).getCell(1).getCellType();           //boolean type
//	 
//	System.out.println(val);
//
//	
//	CellType v1 = w.getRow(2).getCell(1).getCellType();         //numeric type
//	System.out.println(v1);
//	


                                  //getCellType method is used to get the type of the data from excell sheet

                         //when we dont know which type of data is present in excell we will use getcelltype()
	
	
	
	
	if(value==CellType.STRING)
	{
		String e = w.getStringCellValue();
		
		System.out.println(e);
		
	}
	else if(value==CellType.BOOLEAN)
	{
		boolean e = w.getBooleanCellValue();
		System.out.println(e);
		
	}
	
	else if(value==CellType.NUMERIC)
	{
		
		double e = w.getNumericCellValue();
		System.out.println(e);
	}
	
	
	
	
	
	
}}