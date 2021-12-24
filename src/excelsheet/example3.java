package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	
	
	FileInputStream f=new FileInputStream("F:\\sheet3.xlsx");       // to fetch data from excel sheet 1st we need to create object of fileinputstream class and pass the path of the excell sheet
	
	String v = WorkbookFactory.create(f).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();      //then we need to call the function create() which is present in workbookfactory class...if we want to open specific sheet from excel then we need to call the method getsheet()....if we want to identify specific row we need to call the method getrow()....getcell().....to get string type info from excell we need to call the function getstringcellvalue
	
	
	System.out.println(v);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
