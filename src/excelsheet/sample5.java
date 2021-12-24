package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample5 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		
		
		FileInputStream f =new FileInputStream("F:\\sheet3.xlsx");
		
		
		Sheet w1 = WorkbookFactory.create(f).getSheet("Sheet8");
		

		int row = w1.getLastRowNum();
		
		
		for(int i=0;i<=row; i++)
		
		{
			
			int cell = w1.getRow(i).getLastCellNum()-1;
			
			
			for(int j=0;j<=cell;j++)
			
			{
				String v = w1.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(v+"    ");
			}
			
			System.out.println();
			
		}
		
		
		
		
}}
