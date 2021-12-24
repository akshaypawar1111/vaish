package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class t3
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		FileInputStream file=new FileInputStream("F:\\sheet3.xlsx");
		

		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet13");
		
		int last = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=last; i++)
		{
			Cell cellInfo = sh.getRow(0).getCell(i);
			CellType TypeOfCell = cellInfo.getCellType();
			
			if(TypeOfCell==CellType.STRING) 
			{
				String value = cellInfo.getStringCellValue();
				System.out.println(value +" ");
			}
			else if (TypeOfCell==CellType.NUMERIC)
			{
				double value = cellInfo.getNumericCellValue();
				System.out.println(value +" ");
			}
			else if (TypeOfCell==CellType.BOOLEAN)
			{
				 boolean value = cellInfo.getBooleanCellValue();
				System.out.println(value +" ");
			}
		}
		
	}
	
}