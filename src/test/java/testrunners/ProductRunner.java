package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\Product.feature"},
		
		glue = {"steps", "hooks"},
		
		plugin = "pretty",
		
		tags = "not @functional"
	
				
		
		)

public class ProductRunner {

}
