package com.Bank.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Bank.Base.BaseTest;

public class mouse_test1  extends BaseTest{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		mouse_test1 m= new mouse_test1();
		m.launchBrowser("Chrome");
		m.openapp("https://jqueryui.com/resources/demos/slider/default.html");
		
		
		WebElement e=driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.dragAndDropBy(e, 500, 0).perform();
		
		driver.close();
		
		
		mouse_test1 m1= new mouse_test1();
		m.launchBrowser("Chrome");
		m.openapp("https://jqueryui.com/resources/demos/resizable/default.html");
		
		
		WebElement e1=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Actions action1 = new Actions(driver);
		Thread.sleep(3000);
		action1.dragAndDropBy(e1, 500, 300).perform();
		
		
		

	}

}
