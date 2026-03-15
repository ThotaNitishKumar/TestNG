package com.TestNG.Training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPArameters {
	@Test
	@Parameters("browser")
       public void testCaseOne(String browser) {
    	   
    	   System.out.println("browser passed as :- "+ browser);
       }
	@Test
	@Parameters({"username","password"})
       public void testCaseTwo(String username, String password) {
    	   
    	   System.out.println("Parameter for UserName passed as :- "+ username);
    	   System.out.println("Parameter for password passed as :- "+ password);
       }
}
