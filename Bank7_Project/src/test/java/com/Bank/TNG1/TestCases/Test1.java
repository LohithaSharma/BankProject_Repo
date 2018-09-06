package com.Bank.TNG1.TestCases;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups= {"Regression"})
	public void m1() {
		System.out.println("This is regression testcase");
	}
	
	@Test (groups= {"Regression","Smoke"})
	public void m2() {
		System.out.println("This is regression and smoke testcase");
	}
	
	@Test (groups= {"Smoke"})
	public void m3() {
		System.out.println("This is smoke testcase");
	}

}
