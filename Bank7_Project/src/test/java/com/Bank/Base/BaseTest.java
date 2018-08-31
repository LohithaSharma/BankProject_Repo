package com.Bank.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseTest {
	
	
	public static WebDriver driver;
	
	
	public static void launchBrowser(String browsertype)
	{
		if(browsertype=="Chrome") {
		 driver=new ChromeDriver();
		}
		else if(browsertype=="firefox"){
			driver=new FirefoxDriver();
			
		}
		else {
			driver=new InternetExplorerDriver();
		}
	}
	
	
	public static void openapp(String URL)
	{
		driver.get(URL);
		
	}

	public static void Selectvalue(WebElement webelement, int dropdownindexvalue) {
		
		Select s = new Select(webelement );
		s.selectByIndex(dropdownindexvalue);
		
	}
	
	public static void MaximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public static void CloseBrowser() {
		driver.close();
		
		//driver.quit();  to close all assosicated browsers
	}
}
