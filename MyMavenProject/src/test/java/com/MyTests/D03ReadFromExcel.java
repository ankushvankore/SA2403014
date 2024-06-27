package com.MyTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.DataProvider;

public class D03ReadFromExcel {
	String fPath = System.getProperty("user.dir") + "\\ExcelFiles\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@DataProvider
	public String[][] readData() throws IOException
	{
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		
		int rows = sheet.getPhysicalNumberOfRows();
		String[][]loginData = new String[rows][2];

		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				cell = sheet.getRow(i).getCell(j);
				//System.out.println(cell.getStringCellValue());
				loginData[i][j] = cell.getStringCellValue();
			}
		}
		
		wb.close();
		fis.close();
		
		return loginData;
	}
}
