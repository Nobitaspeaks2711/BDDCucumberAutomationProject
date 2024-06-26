package StepsDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features/BackgroundDemo/BackgroundDemo.feature",glue={"StepsForBackground"},
	monochrome = true,
	plugin= {"pretty","junit:target/JunitReport/report.xml",
			"json:target/JSONReports/report.json",
		"html:target/HtmlReport/report.html"})
	public class TestRunnner_Background {
}
