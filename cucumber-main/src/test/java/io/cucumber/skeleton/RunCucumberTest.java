package io.cucumber.skeleton;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "build/resources/main/BruteForceAttack.feature",
        glue = {"io.cucumber.skeleton.steps"}, plugin = {"pretty", "html:target/cucumber-report.html"})
public class RunCucumberTest {
}
