package com.Bank.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Bank.Base.BaseTest;

public class Validate_Month_TestCase extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validate_Month_TestCase vm= new Validate_Month_TestCase();
		vm.launchBrowser("Chrome");
		vm.openapp("https://www.facebook.com/");
		vm.MaximizeBrowser();
		 WebElement e=driver.findElement(By.id("month"));
		vm.Selectvalue(e,9);
		vm.CloseBrowser();
		
	}

}
