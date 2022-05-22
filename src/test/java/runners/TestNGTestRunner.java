package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.CucumberOptions;
import tests.TestBase;

@CucumberOptions(features = "src/test/java/features",
glue ="stepDefinitions", tags = " @Registeredusercheckout ", 
monochrome=true, 
plugin= {"html:target/cucumber.html", "json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"rerun:target/failed_scenarios.txt"}
)

public class TestNGTestRunner extends TestBase
{
	//parallel run 
	@Override
	@DataProvider(parallel=false) 
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
