package Runner;

import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "StepDefinitions",
        dryRun = false,

        tags = "@testCase1 or @dependents",
        plugin ={"pretty", "json:target/cucumber-reports"}


)
public class MainRunner {
}
