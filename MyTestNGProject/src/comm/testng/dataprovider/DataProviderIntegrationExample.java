package comm.testng.dataprovider;

import org.testng.annotations.Test;

public class DataProviderIntegrationExample {
	
	@Test(dataProvider = "TestType", dataProviderClass = DataProviderSource.class)
	public void integrationTest(String data) {
		
	System.out.println("Integration testings: Data(" +data +")");
	}

}
