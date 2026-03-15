package comm.testng.dataprovider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderSource {
	
	@DataProvider(name = "TestType")
	public static Object[][] getTestTypeData(ITestContext context){
		String testName = context.getName();
		if("IntegrationLevel".equals(testName)) {
			
			return new Object[][] {{"Integration Test data"}};
		}else if("AcceptanceLevel".equals(testName)){
			return new Object[][] {{"Accepance test data"}};
			
		}else {
			return new Object[][] {{"Common test data"}};
		}
		}
	
	@DataProvider(name="scenrioData")
	public static Object[][] getScenarioData(Method method){
		String testCase = method.getName();
		if("scenario1".equals(testCase)) {
			
			return new Object[][] {{"Scenario1 data"}};
		}else if("scenario2".equals(testCase)){
			return new Object[][] {{"Scenario2 data"}};
			
		}else {
			return new Object[][] {{"Common scenario data"}};
		}
		}

}


/*1️⃣ Overall Project Structure

You have 5 components working together.

DataProviderSource.java          → provides test data
dataProviderParameterExample.java → scenario tests
DataProviderIntegrationExample.java → integration test
DataProviderAcceptanceExample.java → acceptance test
testng.xml                        → controls execution

Execution flow:

testng.xml
   ↓
Test Classes
   ↓
@DataProvider called
   ↓
DataProviderSource class
   ↓
Return test data
   ↓
Test method executes
2️⃣ Understanding DataProviderSource

This class contains two DataProviders.

@DataProvider(name="TestType")
@DataProvider(name="scenrioData")

Each DataProvider supplies test data dynamically.

3️⃣ First DataProvider – TestType
@DataProvider(name = "TestType")
public static Object[][] getTestTypeData(ITestContext context)
Purpose

Return different data depending on test name in XML.

It uses:

ITestContext context

which contains runtime info about TestNG execution.

Step 1: Get Test Name
String testName = context.getName();

This retrieves the name of the <test> tag in testng.xml.

Example from your XML:

<test name="IntegrationLevel">

So:

testName = "IntegrationLevel"
Step 2: Condition Logic
if("IntegrationLevel".equals(testName))

If test name is:

IntegrationLevel

Return:

{"Integration Test data"}

Next condition:

else if("AcceptanceLevel".equals(testName))

Return:

{"Accepance test data"}

Else condition:

else

Return:

{"Common test data"}
Important Concept

TestNG expects Object[][] because each row represents one test execution.

Example:

return new Object[][] {
 {"data1"},
 {"data2"}
};

This would run test two times.

Your code returns one row, so the test runs once.

4️⃣ Second DataProvider – scenrioData
@DataProvider(name="scenrioData")
public static Object[][] getScenarioData(Method method)

Here TestNG passes the current test method information.

Method method comes from Java Reflection API.

Step 1: Get Method Name
String testCase = method.getName();

If executing:

scenario1()

then:

testCase = "scenario1"
Step 2: Condition Logic
if("scenario1".equals(testCase))

Return:

{"Scenario1 data"}

Next condition:

else if("scenario2".equals(testCase))

Return:

{"Scenario2 data"}

Else condition:

else

Return:

{"Common scenario data"}

This will be used for any other test method.

5️⃣ Scenario Test Class
dataProviderParameterExample

Contains 3 test methods.

All use the same DataProvider:

@Test(dataProvider="scenrioData")

Execution order:

scenario1
scenario2
commonScenario
First Test
public void scenario1(String scenarioData)

TestNG calls DataProvider:

getScenarioData(Method method)

method name:

scenario1

Condition check:

if("scenario1".equals(testCase))

TRUE

So returned data:

{"Scenario1 data"}

Test prints:

Scenario testing: Data(Scenario1 data)
Second Test
public void scenario2(String scenarioData)

method name:

scenario2

Condition:

else if("scenario2".equals(testCase))

TRUE

Returned:

{"Scenario2 data"}

Output:

Scenario testing: Data(Scenario2 data)
Third Test
public void commonScenario(String scenarioData)

method name:

commonScenario

Check conditions:

scenario1 ? → false
scenario2 ? → false

So:

else

Return:

{"Common scenario data"}

Output:

Common Scenario testing: Data(Common scenario data)
6️⃣ Integration Test Class
DataProviderIntegrationExample

Test method:

integrationTest(String data)

Uses DataProvider:

TestType

TestNG calls:

getTestTypeData(ITestContext context)
Get Test Name from XML

In XML:

<test name="IntegrationLevel">

So:

testName = IntegrationLevel

Condition:

if("IntegrationLevel".equals(testName))

TRUE

Return:

{"Integration Test data"}

Output:

Integration testings: Data(Integration Test data)
7️⃣ Acceptance Test Class
DataProviderAcceptanceExample

Test method:

acceptanceTest(String data)

TestNG calls:

getTestTypeData()

XML:

<test name="AcceptanceLevel">

So:

testName = AcceptanceLevel

Condition:

else if("AcceptanceLevel".equals(testName))

TRUE

Return:

{"Accepance test data"}

Output:

Acceptance testing: Data(Accepance test data)
8️⃣ Understanding testng.xml

Your suite:

<suite name="Data provider">

Contains 3 tests.

Test 1
<test name="Unit TEst">

Runs:

dataProviderParameterExample

3 methods executed.

Test 2
<test name="IntegrationLevel">

Runs:

DataProviderIntegrationExample
Test 3
<test name="AcceptanceLevel">

Runs:

DataProviderAcceptanceExample
9️⃣ Final Execution Order

TestNG executes:

1️⃣ Unit Test
   scenario1
   scenario2
   commonScenario

2️⃣ IntegrationLevel
   integrationTest

3️⃣ AcceptanceLevel
   acceptanceTest
🔟 Final Console Output
Scenario testing: Data(Scenario1 data)
Scenario testing: Data(Scenario2 data)
Common Scenario testing: Data(Common scenario data)

Integration testings: Data(Integration Test data)

Acceptance testing: Data(Accepance test data)

Total tests executed:

5 tests
1️⃣1️⃣ Key Concepts This Code Demonstrates
1️⃣ Dynamic DataProvider using Method
Method method

Allows different test methods to receive different data.

2️⃣ Dynamic DataProvider using ITestContext
ITestContext context

Allows different test groups (Integration / Acceptance) to receive different data.

3️⃣ DataProvider reuse

Instead of writing many DataProviders:

scenario1Data
scenario2Data
integrationData
acceptanceData

You created only 2 DataProviders.*/
