package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D12CreateLoginFile {
	String fPath = System.getProperty("user.dir") + "\\Excel Files\\LoginData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int i = 1;
	
	@Test(dataProvider = "getLoginData")
	public void createLoginData(String un, String ps) {
		row = sheet.createRow(i);
		cell = row.createCell(0);
		cell.setCellValue(un);
		
		cell = row.createCell(1);
		cell.setCellValue(ps);
		
		cell = row.createCell(2);
		cell.setCellValue("Not Run");
		
		i++;
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "kiran", "kiran123" },
			new Object[] { "anitha", "anitha123" },
			new Object[] { "admin", "admin123" },
		};
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("OHRMLogin");
		
		sheet.createRow(0).createCell(0).setCellValue("User Name");
		sheet.getRow(0).createCell(1).setCellValue("Password");
		sheet.getRow(0).createCell(2).setCellValue("Result");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
