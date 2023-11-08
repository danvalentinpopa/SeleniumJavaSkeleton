package utils;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/AccountManagement.feature", // Path to your feature files
        glue = "tests.bdd"
                )
public class BddTestRunner extends AbstractTestNGCucumberTests {
}
