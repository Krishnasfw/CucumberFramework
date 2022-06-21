package testrunnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefiles/Semnoxlogin.feature",
		glue = { "stepdefinitionfile"}, 
		stepNotifications = true, 
		dryRun = false
		, monochrome = true
		,tags = "@LoginFunction"
		,plugin = {"pretty","html:output/test-output.html","json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml"}
		)

public class TestRunnerfile {
	
}	