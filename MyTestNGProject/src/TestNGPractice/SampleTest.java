package TestNGPractice;

import org.testng.annotations.*;

public class SampleTest {
	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("Executing Before Test Suite");
		
	}
	   @Test
	    public void testMethod() {
	        System.out.println("Executing Test Method");
	    }
@AfterSuite	
public void afterSuiteMethod() {
		System.out.println("Executing After Test Suite");
	}

}
