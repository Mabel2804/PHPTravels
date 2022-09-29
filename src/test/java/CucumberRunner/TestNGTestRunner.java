package CucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features", glue="StepDefinitions")
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
