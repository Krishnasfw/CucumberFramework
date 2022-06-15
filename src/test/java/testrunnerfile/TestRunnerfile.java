package testrunnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefiles/CustomerCreation.feature",
		glue = { "stepdefinitionfile","Hooks"}, 
		stepNotifications = true, 
		dryRun = false, monochrome = true, tags = "@Negative"
		,plugin = {"pretty","html:output/test-output.html","json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml"})

public class TestRunnerfile {
	
}