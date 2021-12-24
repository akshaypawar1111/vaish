package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class t2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		FileInputStream file=new FileInputStream("F:\\sheet3.xlsx");
		

		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet10");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			Cell cellInfo = sh.getRow(i).getCell(0);
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
