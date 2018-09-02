package com.Bank.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Bank.Base.BaseTest;

public class mouseover_test extends BaseTest {

	public static void main(String[] args) {
		
		
		 mouseover_test mt= new  mouseover_test();
		 
		 mt.launchBrowser("Chrome");
		 mt.openapp("http://store.demoqa.com/");
		 
	WebElement	e= driver.findElement(By.linkText("Product Category"));
	
	Actions action = new Actions(driver);  //create object usign Actions class and passed driver  arg
		
	 action.moveToElement(e).perform(); 
	
	
	driver.findElement(By.xpath("//*[@id='menu-item-37']/a")).click();
	
	

	}

}
