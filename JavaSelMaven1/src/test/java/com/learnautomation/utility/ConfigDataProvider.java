package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
public class ConfigDataProvider {
	Properties pro;
	
	public ConfigDataProvider()  {
	File src = new File("./Config/config.properties");
	try {
		FileInputStream fis = new FileInputStream(src);
		 pro = new Properties();
		 pro.load(fis);
	} catch (IOException e) {
	
		e.printStackTrace();
		System.out.println("Unable to read file"+ e.getMessage());
	}
	}
	
	public String  getDataFromConfig(String keytoSearch) {
		return pro.getProperty(keytoSearch);
	}
	public String  getBrowser() {
		return pro.getProperty("Browser");
	}
	
	public String  getURL() {
		return pro.getProperty("qaURL");
	}
}
