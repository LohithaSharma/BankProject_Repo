package com.Bank.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Bank.Base.BaseTest;

public class RightClick_Test extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RightClick_Test rt=new RightClick_Test();
		rt.launchBrowser("Chrome");
		rt.openapp("http://deluxe-menu.com/popup-mode-sample.html");
	
		
		WebElement img = driver.findElement(By.xpath("//p[2]/img"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(img).perform();

	}

}
