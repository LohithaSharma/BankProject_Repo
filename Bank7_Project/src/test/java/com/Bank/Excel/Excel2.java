package com.Bank.Excel;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Bank.Base.BaseTest;

public class Excel2 extends BaseTest {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
Excel2 ex=new Excel2();
String ExcelPath= System.getProperty("user.dir")+"\\TestData.xlsx";
System.out.println(ExcelPath);
File fl=new File(ExcelPath);
//FileInputStream fi=new FileInputStream(fl);
FileInputStream fi= new FileInputStream(fl);
XSSFWorkbook xbk=new XSSFWorkbook(fi);
 XSSFSheet Sheet1=xbk.getSheetAt(0);
 int row=Sheet1.getLastRowNum();
System.out.println(row);

for(int i = 1;i<=row;i++) {
	String serialNo=Sheet1.getRow(i).getCell(0).getStringCellValue();
	System.out.println(serialNo);
	String frstname=Sheet1.getRow(i).getCell(1).getStringCellValue();
	System.out.println(frstname);
	
	String lastname=Sheet1.getRow(i).getCell(2).getStringCellValue();
	System.out.println(lastname);
}


	}

}
