package com.TestNG.Training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	@Test
	public void testOne() {
		System.out.println("Hi I am Test one ...");
		Assert.assertEquals("FaceBook", "FaceBook");
	}
	@Test
	public void testTwo() {
		Assert.assertEquals(200, 404);
		System.out.println("Hi I am Test two ...");
		
	}
	@Test
	public void testThree() {
		System.out.println("Hi I am Test three ...");
		Assert.assertTrue(true);
		
	}
	@Test
	public void testFour() {
		System.out.println("Hi I am Test four ...");
		Assert.assertTrue(false, "Making test Failure");
	}
	@Test
	public void testFive() {
		System.out.println("Hi I am Test five ...");
		
	}
	@Test
	public void testSix() {
		System.out.println("Hi I am Test six ...");
	}

}
