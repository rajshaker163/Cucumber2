package StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\New folder\\Cucumber2\\src\\test\\resources\\feature\\Details.feature",glue= {"StepDefination"},
format= {"pretty","D:\\New folder\\Cucumber2\\target\\HTMLreports"},tags= {"@Application"})
public class TestRun {

}
