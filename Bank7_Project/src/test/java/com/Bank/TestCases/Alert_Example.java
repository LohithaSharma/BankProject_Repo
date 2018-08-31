package com.Bank.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Bank.Base.BaseTest;

public class Alert_Example extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alert_Example alert=new Alert_Example();
		alert.launchBrowser("Chrome");
		alert.openapp("http://jqueryui.com/");
		driver.findElement(By.linkText("Spinner")).click();
	WebElement	a=driver.findElement(By.xpath("//*[@id='content']/iframe"));
	driver.switchTo().frame(a);
		driver.findElement(By.id("spinner")).sendKeys("2");
		driver.findElement(By.id("getvalue")).click();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
driver.switchTo().alert().accept();//going to click  OK button on alert screen

driver.switchTo().defaultContent();
driver.findElement(By.linkText("Sortable")).click();
	}

}
