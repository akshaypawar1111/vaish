package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample6
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		
		
		FileInputStream f =new FileInputStream("F:\\sheet3.xlsx");
		
		
		Sheet c = WorkbookFactory.create(f).getSheet("Sheet9");
		
		
		int row = c.getLastRowNum();
		
		for(int i=0;i<=row;i++)
		{
			
			int cell = c.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=cell;j++)
			{
				double value = c.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(value+"    ");
				
			}
			System.out.println();
			
		}
		
		
		
		
}}
