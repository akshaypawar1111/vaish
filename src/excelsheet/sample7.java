package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample7 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		
		
		FileInputStream f =new FileInputStream("F:\\sheet3.xlsx");
		
		
//		int w = WorkbookFactory.create(f).getSheet("Sheet6").getLastRowNum()+1;       //row size
//		
//		System.out.println(w);
//		
//		
		
//		short cell = WorkbookFactory.create(f).getSheet("Sheet6").getRow(2).getLastCellNum();   //cell size
//		
//		
//		System.out.println(cell);
//		
		
		Sheet ff = WorkbookFactory.create(f).getSheet("Sheet6");
		
		
		int row = ff.getLastRowNum();
		
		for(int i=0;i<=row;i++)
		
		{
			
			 int cc = ff.getRow(i).getLastCellNum()-1;
			
			for(int k=0;k<=cc;k++)
			{
				
				String value = ff.getRow(i).getCell(k).getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println();
			
		}
		
		
		
		
		
}}
