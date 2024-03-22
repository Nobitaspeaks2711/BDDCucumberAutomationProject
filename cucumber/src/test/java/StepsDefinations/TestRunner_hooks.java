package StepsDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Hooks/HooksDemo.feature",
		glue = {"StepOfHooks"},
		monochrome = true,
		plugin= {"pretty","junit:target/JunitReport/report.xml",
				"json:target/JSONReports/report.json",
		"html:target/HtmlReport/report.html"})

public class TestRunner_hooks {
}
