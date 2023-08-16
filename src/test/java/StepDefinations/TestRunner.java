package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features", // give single forward slash as it will run on all OS
		glue = { "StepDefinations" }, 
		monochrome = true,
		plugin = { "pretty",
				   "html:target/HtmlReports", //create Html report
				   "json:target/JsonReport/jsonReport.json",// to create json report first create folder in 'target' folder
				   "junit:target/JUnitReport/junitReport.json"}, // to create junit report first create folder in 'target' folder
		tags="@googleSearch")
public class TestRunner {

}
