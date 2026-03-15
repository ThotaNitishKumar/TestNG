
package comm.testng.dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPArameerExample {
	
	@Test(dataProvider = "DoubleSet")
	public void testAdd(int actual, int expected) {
		int actualValue = actual + 20;
		Assert.assertEquals(actualValue, expected);
	}
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {
			{100,120},
			{200,220},
			{300,320},
			{400,420},
			{500,510}
			
		};
		
	}	
		@DataProvider(name="DoubleSet")
		public Object[][] getSet2(){
			return new Object[][] {
				{10,30},
				{20,40}
				
				
			};
		
		
	}

}
