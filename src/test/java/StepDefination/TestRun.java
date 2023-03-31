package StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="D://New folder//Cucumber2//src//test//resources//Features//Details.feature",
glue= "StepDefination",
plugin={"pretty","json:D\\New folder\\Cucumber2\\target\\jsonreports"
		        , "html:D\\New folder\\Cucumber2\\target\\htmlreports"
	 }
//tags= {"@Application"})
)

public class TestRun {

}
