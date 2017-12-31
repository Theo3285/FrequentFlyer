package com.kata.tdd;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/FeaturesReport"},
        tags = {"@earning-points, @earning-status"},
        features = "src/it/resources/features/"
)
public class RunAllAcceptanceTests {
}
