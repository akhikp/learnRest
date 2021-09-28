package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue="StepDefs",
        plugin = "json:target/jsonReports/cucumber_report.json"
        )
public class TestRunner {

}
