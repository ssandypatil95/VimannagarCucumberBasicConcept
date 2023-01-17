package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\SearchPage.feature"},
		
		glue = {"steps", "hooks"},
		
		plugin = "pretty",
		
		dryRun = true
		
		
		
		
		)

public class AmazonRunner {

}
