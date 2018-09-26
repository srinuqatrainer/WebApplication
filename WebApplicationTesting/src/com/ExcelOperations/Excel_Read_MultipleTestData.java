package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException 
	{

		// Identify the file on the System
				//FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\GayatriSelenium\\WebApplicationTesting\\ExcelTestDataFiles\\SingleTestData.xlsx");
				//or
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\ExcelTestDataFiles\\MultipleTestData.xlsx");
				
				// Identify the WorkBook in the File
				XSSFWorkbook workBook = new XSSFWorkbook(file);
				
				// Identify a particular sheet in the WorkBook
				XSSFSheet sheet = workBook.getSheet("Sheet1");
				
				// Identify how many Rows with Data
				
				int rowCount=sheet.getLastRowNum(); 
				
				for(int i=0;i<=rowCount;i++) // to goto every Row
				{
					Row r=sheet.getRow(i);
					
					// in the Row identify how many cells with data
					int cellCount=r.getLastCellNum();
					
					for(int j=0;j<cellCount;j++) // going to every row of a cell
					{
						Cell c=r.getCell(j); // goes to every cell of the particular row
						
						// get the data from the row of cell
						String data=c.getStringCellValue();
						System.out.print(data+"  ");
					}
					System.out.println();
					
				}


	}

}
