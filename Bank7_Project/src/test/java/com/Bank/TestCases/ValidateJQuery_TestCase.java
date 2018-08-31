package com.Bank.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Bank.Base.BaseTest;

public class ValidateJQuery_TestCase extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validate_Month_TestCase jq=new Validate_Month_TestCase();
		jq.launchBrowser("Chrome");
	jq.openapp("http://jqueryui.com/");	
	driver.findElement(By.xpath("//a[text()='Selectable']")).click();
	WebElement frame=driver.findElement(By.xpath("//*[@id='content']/iframe"));
	driver.switchTo().frame(frame);//change focus from page to frame
			
driver.findElement(By.xpath("//li[text()='Item 1']")).click();

driver.switchTo().defaultContent();//change focus from frame to page
driver.findElement(By.xpath("//a[text()='Sortable']")).click();

	
		
		

	}

}
