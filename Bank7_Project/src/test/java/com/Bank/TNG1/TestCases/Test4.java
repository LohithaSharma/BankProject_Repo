package com.Bank.TNG1.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test4 {
	
    public static ExcelReader excel;
	
	public static WebDriver driver;
	
	@Test(dataProvider="getDataFromExcel")
	public void CreateFBAccount(String URL,String fname,String lname) {
		
		 driver = new ChromeDriver();
		
		driver.get(URL);
		
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
	}
	
	@DataProvider
	public static Object[][] getData() {
		//store  the data 
		
		Object[][]  data = new Object[3][2];
		
		data[0][0]="sri";
		data[0][1]="muvva";
		
		data[1][0]="Lohitha";
		data[1][1]="S";
		
		data[2][0]="Venkat";
		data[2][1]="V";
		
		return data;
		
	}
	
	
	@DataProvider
	public static Object[][] getDataFromExcel() {
		
		//create object using ExcelReader class 
		if (excel==null){
			  
			  excel= new ExcelReader(System.getProperty("user.dir")+ "\\TestData.xlsx");
		  }
		  
		//excel= new ExcelReader(System.getProperty("user.dir")+ "\\TestData.xlsx");
		
		  String sheetName="sheet1";

		  int rows= excel.getRowCount(sheetName);
		  System.out.println("Total rows count" + rows );
		  
		  int cols= excel.getColumnCount(sheetName);
		  System.out.println("Total cols count" + cols );
		  
		  Object[][] data=new Object[rows-1][cols];
		  
		
		  
		  for (int rowNum=2;rowNum<=rows; rowNum++){
			  
			  for (int colNum=0;colNum<cols; colNum++) {
				  
				  data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
				  //data[0][0]==excel.getCellData(sheetName, colNum, rowNum);
			  }
			  
		  }
		  
		  
		  return data;
		  
	}

	

}
