package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example9_row_size 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{



	FileInputStream f =new FileInputStream("F:\\sheet3.xlsx");
	
	
	
	int rowsize = WorkbookFactory.create(f).getSheet("Sheet2").getLastRowNum()+1;     //to get row size ...call function getlastrownum()+1
	
	System.out.println(rowsize);
	
	
	//int rowindex = WorkbookFactory.create(f).getSheet("Sheet2").getLastRowNum();    //row index....getlastrownum()
	
	//	System.out.println(rowindex);
		
	
	
	
	

}}
