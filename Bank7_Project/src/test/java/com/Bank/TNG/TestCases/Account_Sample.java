package com.Bank.TNG.TestCases;

import org.testng.annotations.Test;

import com.Bank.Base.BaseTest;

public class Account_Sample  extends BaseTest{
	
	
	@Test
	public void EditAccount() {
		Account_Sample as= new Account_Sample();
		
		as.launchBrowser("Chrome");
		as.openapp("https://www.facebook.com/");
		
	}
	

}
