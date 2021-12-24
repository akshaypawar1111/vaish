package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example8                  //mobilenumber
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{



FileInputStream f =new FileInputStream("F:\\sheet3.xlsx");

  String d = WorkbookFactory.create(f).getSheet("Sheet3").getRow(4).getCell(1).getStringCellValue();


System.out.println(d);





















	
}
}
