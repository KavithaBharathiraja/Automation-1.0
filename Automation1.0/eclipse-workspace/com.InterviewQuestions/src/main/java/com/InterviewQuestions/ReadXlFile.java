package com.InterviewQuestions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXlFile {

	static XSSFWorkbook excelworkbook;
	static XSSFSheet excelworksheet;
	
	public static void main(String[] args) throws IOException {
		        //1.Get the path of the file
		
				String filepath = "/Users/kavithabharathiraja/Documents/TestXL.xlsx";
				
		       //2.Add the file to fileInputStreams
				
				FileInputStream excelfile = new FileInputStream(filepath);
				
				//3.file input stream an workbook
				
				excelworkbook = new XSSFWorkbook(excelfile);
				
				//4.get the information from excel sheet
				
				
				excelworksheet	 = excelworkbook.getSheet("Test1");
				
				
				System.out.println(excelworksheet.getRow(3).getCell(1));
				
				
				int TotalRows = excelworksheet.getLastRowNum();
				int TotalCols = 2;
				
			    for(int i=0; i<TotalRows; i++) {
				
				for(int j=0; j<TotalCols; j++) {
					
	
				System.out.print(excelworksheet.getRow(i).getCell(j));
				
				System.out.print("\t");	
			}
			
			System.out.println(" ");
			
			
	}	
	
				
	}

}
