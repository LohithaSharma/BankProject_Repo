package com.Bank.TestCases;

import com.Bank.Base.BaseTest;

public class LaunchFB_TestCase extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaunchFB_TestCase fb=new LaunchFB_TestCase();
		
fb.launchBrowser("Chrome");
fb.openapp("https://www.facebook.com/");

	}

}
