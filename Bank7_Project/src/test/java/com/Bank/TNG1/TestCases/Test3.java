package com.Bank.TNG1.TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	
	@Parameters({"url","uname"})
	@Test
	public void Login(String url,String uname) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		
		String s=driver.getTitle();
		
		System.out.println(uname);
		
	
		Assert.assertEquals(s, "Facebook - Log In or Sign Up1");
		

		
	}

}
