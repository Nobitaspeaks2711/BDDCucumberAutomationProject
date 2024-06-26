package StepsDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/FeatureWithTags/Tags.feature",
    glue = {"StepsDefinations"},
    tags = "smoke or @regression and important"
)
public class TestRunner_single {
}
