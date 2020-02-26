package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/feature_file/features/cash_withdrawal.feature", 
glue = "classpath:step_definitions",
dryRun = true,
snippets = SnippetType.CAMELCASE,
plugin = {"pretty"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}


//@CucumberOptions(features = "classpath:feature_file/checkout.feature", glue = "classpath:step_definitions", plugin = {"pretty"})
//@CucumberOptions(features = "classpath:feature_file/checkouts.feature", glue = "classpath:step_definitions", plugin = {"pretty"})
//@CucumberOptions(features = "classpath:feature_file/checkout2banana.feature", glue = "classpath:step_definitions", plugin = {"pretty"})

//dryRun = true,	//will only check that every step in feature file has a step definition written.
//snippets = SnippetType.CAMELCASE,	//will create the methods in java syntex rules import cucumber.api.SnippetType;