package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src\\test\\resources\\ScenarioOutline.feature",
		
		glue = {"steps" , "hooks"},
		
		plugin = "pretty"
		
		
		)


public class ScenarioOutlineRunner  extends AbstractTestNGCucumberTests    {
	
	

}
