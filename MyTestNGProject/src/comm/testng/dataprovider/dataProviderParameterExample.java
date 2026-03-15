package comm.testng.dataprovider;

import org.testng.annotations.Test;

public class dataProviderParameterExample {
	
	@Test(dataProvider = "scenrioData", dataProviderClass = DataProviderSource.class)
	public void scenario1(String scenarioData) {
		
	System.out.println("Scenario testing: Data(" +scenarioData +")");
	}
	
	@Test(dataProvider = "scenrioData", dataProviderClass = DataProviderSource.class)
	public void scenario2(String scenarioData) {
		
	System.out.println("Scenario testing: Data(" +scenarioData +")");
	}
	
	@Test(dataProvider = "scenrioData", dataProviderClass = DataProviderSource.class)
	public void commonScenario(String scenarioData) {
		
	System.out.println("Common Scenario testing: Data(" +scenarioData +")");
	}

}
