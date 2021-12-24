package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example6 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	
	FileInputStream f =new FileInputStream("F:\\sheet3.xlsx");
	
	    String v = WorkbookFactory.create(f).getSheet("Sheet2").getRow(5).getCell(1).getStringCellValue();
	
	
	System.out.println(v);
	
	
	
	
	
}
}
