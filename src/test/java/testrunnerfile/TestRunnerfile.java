package testrunnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefiles/CustomerCreation.feature",
		glue = { "stepdefinitionfile","Hooks"}, 
		stepNotifications = true, 
		dryRun = false
		, monochrome = true
		,tags = "@LoginFunction"
		,plugin = {"pretty","html:output/test-output.html","json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",}
		)

public class TestRunnerfile {
	
}
//https://reports.cucumber.io/reports/6b568ca4-3689-486b-9504-e5726180d0e5