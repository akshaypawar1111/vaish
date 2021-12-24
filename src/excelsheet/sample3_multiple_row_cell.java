package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample3_multiple_row_cell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		
		
		FileInputStream f =new FileInputStream("F:\\sheet3.xlsx");
		
		
		Sheet p = WorkbookFactory.create(f).getSheet("Sheet6");
		
		
		int row = p.getLastRowNum();
		
		for(int i=0; i<=row;i++)
		{
			
			int cell = p.getRow(i).getLastCellNum()-1;
			
			for(int j=0; j<=cell;j++)
			
			
			{
				String value = p.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value +"         ");
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
