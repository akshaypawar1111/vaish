package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example9_cell_size 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{



	FileInputStream f =new FileInputStream("F:\\sheet3.xlsx");
	
	
	
	short cellsize = WorkbookFactory.create(f).getSheet("Sheet2").getRow(0).getLastCellNum();    //to get cell size ...getlastcellnum();
	
	System.out.println(cellsize);
	
//int cellindex = WorkbookFactory.create(f).getSheet("Sheet2").getRow(0).getLastCellNum()-1;    //to get cell index ....getlastcellnum()-1;
//	
//	System.out.println(cellindex);
//	
	
}}
