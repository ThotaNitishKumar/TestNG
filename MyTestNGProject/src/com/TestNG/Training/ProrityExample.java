package com.TestNG.Training;


import org.testng.annotations.Test;

public class ProrityExample {
	@Test
	public void testOne() {
		System.out.println("Hi I am Test one ...");
	}
	@Test(priority =1)
	public void testTwo() {
		System.out.println("Hi I am Test two ...");
	}
	@Test(priority =2)
	public void testThree() {
		System.out.println("Hi I am Test three ...");
		
	}
	@Test(priority =3)
	public void testFour() {
		System.out.println("Hi I am Test four ...");
	}


}
