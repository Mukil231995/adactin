package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Users\\mukil\\eclipse-workspace\\com.adactin\\featureFile\\adactin.feature",
                  glue="stepDefenation",monochrome=true,dryRun=false,plugin="json:target/report.json")
public class TestRunner {

	@AfterClass
	public static void afterclass() {

		jvmReport.generateJvmReport("E:\\Users\\mukil\\eclipse-workspace\\com.adactin\\target\\report.json");
	}
}
