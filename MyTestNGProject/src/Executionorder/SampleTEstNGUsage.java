package Executionorder;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SampleTEstNGUsage {
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("From BeforeTEst annotation is SampleTEstNGUsage class ... ");
	}
	@BeforeSuite
	
public void beforeSuite() {
		
		System.out.println("From BeforeSuite annotation is SampleTEstNGUsage class ... ");
	}

}
