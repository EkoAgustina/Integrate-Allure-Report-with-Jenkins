package CucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test()
@CucumberOptions(
        features = "src/test/resources/SwagLabs"
        ,glue = {"stepDefinitions", "cucumberHooks"}
        ,plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
        ,tags = ""
        ,monochrome = true
        ,publish = true
)

//baruu

public class TestRunner extends AbstractTestNGCucumberTests {
}
