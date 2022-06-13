package testrunnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefiles/bdd.feature", glue = "stepdefinitionfile", stepNotifications = true, dryRun = false, monochrome = true )
public class TestRunnerfile {

}
