package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
public class ExcelDataProvider {
	XSSFWorkbook wb;
	
	public ExcelDataProvider()  {
	File src = new File("./Config/config.properties.xlsx");
	try {
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	} catch (IOException e) {
	
		e.printStackTrace();
		System.out.println("Unable to read excel file"+ e.getMessage());
	}
	}
	
	public String  getStringData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	public double getNumericData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
}
