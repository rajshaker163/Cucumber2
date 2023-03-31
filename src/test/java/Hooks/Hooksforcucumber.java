package Hooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\New folder\\Cucumber2\\src\\test\\resources\\Hooks",
plugin= { "pretty","html:target/cucumber2-html-report"},glue={" Hooks"})


public class Hooksforcucumber {

}
