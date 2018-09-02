package com.Bank.Base;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	
	public static String getDate() {
		
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss");  
		 LocalDateTime now = LocalDateTime.now();  
		 String CurrDate= dtf.format(now);
		 
		 return CurrDate;
	}
	
	public static void screenshot() throws IOException {
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		//as we cannt create object for takescreenshot
		File source=ts.getScreenshotAs(OutputType.FILE);
 
		FileUtils.copyFile(source, new File("C:/Softwares/ "+ "facebook"+"_" + getDate() +".png"));
		//System.out.println("screenshot succesfull");
		 
		//System.out.println("welcome"+ "_"+ "java"+getDate() + ".png" );
 
	}
	
}
