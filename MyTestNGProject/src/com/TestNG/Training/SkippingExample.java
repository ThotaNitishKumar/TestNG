package com.TestNG.Training;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingExample {
	
	@Test
	public void testOne() {
		System.out.println("Hi I am Test one ...");
	}
	@Test(enabled=false)
	public void testTwo() {
		System.out.println("Hi I am Test two ...");
	}
	@Test
	public void testThree() {
		System.out.println("Hi I am Test three ...");
		
		throw new SkipException("Skipping because it is not completed");
	}
	@Test
	public void testFour() {
		System.out.println("Hi I am Test four ...");
	}

}
