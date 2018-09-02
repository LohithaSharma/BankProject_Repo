package com.Bank.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

//import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;

import com.Bank.Base.BaseTest;

public class Screenshot_Example extends BaseTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Screenshot_Example screen=new Screenshot_Example();
		screen.launchBrowser("Chrome");
		screen.openapp("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("lohitha");
	
TakesScreenshot ts=(TakesScreenshot)driver;
		//as we cannt create object for takescreenshot

 File source=ts.getScreenshotAs(OutputType.FILE);
 
 FileUtils.copyFile(source, new File("./ScreenShots_Folder/facebook.png")) ;
 System.out.println("screenshot succesfull");
 
 
 

	}

}
