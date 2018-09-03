package com.Bank.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
	
	//String ExcelPath="C:\\abc30\\TestData.xlsx";
	
	String ExcelPath=System.getProperty("user.dir")+"\\TestData.xlsx";
	
	File src= new File(ExcelPath);
	
	FileInputStream fis= new FileInputStream(src);

	//FileInputStream fis1= new FileInputStream(new File("C:\\abc30\\TestData.xlsx"));
	//XSSFWorkbook() - class purpose is read the data from XLSX formate
	//HSSFWorkbook() - class purpose is read the data from XLS formate
	
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	
	XSSFSheet sheet1=wb.getSheetAt(0);
	
	int rowNum=sheet1.getLastRowNum();
	
	System.out.println(rowNum);
/*	
	String url=sheet1.getRow(1).getCell(0).getStringCellValue();
	
	System.out.println(url);
	
	
	
String Fname=sheet1.getRow(1).getCell(1).getStringCellValue();
	
	System.out.println(Fname);
	
String Lname=sheet1.getRow(1).getCell(2).getStringCellValue();
	
	System.out.println(Lname);*/
	
	
	for(int i=1;i<=rowNum;i++) {
		
		String url=sheet1.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println(url);
		
	String Fname=sheet1.getRow(i).getCell(1).getStringCellValue();
		
		System.out.println(Fname);
		
		String Lname=sheet1.getRow(i).getCell(2).getStringCellValue();
		
		System.out.println(Lname);
		
	
	
	}
	
		
	
	}

}
