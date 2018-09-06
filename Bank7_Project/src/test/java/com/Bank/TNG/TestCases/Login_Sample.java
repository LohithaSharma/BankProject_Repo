package com.Bank.TNG.TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Bank.Base.BaseTest;

public class Login_Sample extends BaseTest{
	
	@BeforeSuite
	public void getData() {
		//Read data from XLS
		
		System.out.println("read data from XLS");
	}
	
	@BeforeClass
	public void m1() {
		System.out.println("before Login sampel class code ");
	}
	
	@AfterClass
	public void m2() {
		System.out.println("After Login sampel class code ");
	}
	@BeforeMethod
	public void lunchAPPlication() {
		Login_Sample ls= new Login_Sample();
		ls.launchBrowser("Chrome");
		ls.openapp("https://facebook.com");
	}
	
	@Test(priority=0,groups= {"Regression"})
	public void Login() {
			
		driver.findElement(By.name("firstname")).sendKeys("Sri");
		driver.findElement(By.name("lastname")).sendKeys("Muvva");

	}
	
	@Test(priority=1,groups= {"Regression","Smoke"})
	public void FBLogout() {
		
		String s=driver.getTitle();
		System.out.println(s);
		
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
	}

	@AfterSuite
	public void closeData() {
		//Read data from XLS
		
		System.out.println("Close  data from XLS");
	}
	
	

}
