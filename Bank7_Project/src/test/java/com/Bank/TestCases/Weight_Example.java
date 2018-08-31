package com.Bank.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.Bank.Base.BaseTest;

public class Weight_Example extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Weight_Example w=new Weight_Example();
w.launchBrowser("Chrome");
driver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
w.openapp("http://jqueryui.com/");
//driver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
driver.findElement(By.linkText("Spinner1")).click();
	}

}
