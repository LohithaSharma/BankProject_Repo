package com.Bank.TestCases;

import org.openqa.selenium.By;

import com.Bank.Base.BaseTest;

public class Link_textExample extends BaseTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link_textExample link= new Link_textExample();
		link.launchBrowser("Chrome");
        link.openapp("https://www.facebook.com/");
       // driver.findElement(By.linkText("Messenger")).click();
        driver.findElement(By.partialLinkText("Messen")).click();
	}

}
