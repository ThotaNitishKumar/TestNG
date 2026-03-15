package com.TestNG.Training;


import org.testng.annotations.Test;

public class TestCaseGrouping {
	
	@Test(groups="Regression")
	public void testOne() {
		System.out.println("Hi I am Test one ... And in regression Grop");
	}
	@Test(groups="Regression")
	public void testTwo() {
		System.out.println("Hi I am Test two ... And in Regression group");
	}
	@Test(groups="Smoke Test")
	public void testThree() {
		System.out.println("Hi I am Test three ... And in smoke group");
		
		
	}
	@Test(groups={"Regression","Sanity"})
	public void testFour() {
		System.out.println("Hi I am Test four ..And in Regression and Sanity group");
	}
	
	

}
