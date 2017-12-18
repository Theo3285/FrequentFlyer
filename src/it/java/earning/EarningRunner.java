package earning;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/it/resources/features/",
        tags = {"@earning-status"},
        snippets = SnippetType.CAMELCASE
)
public class EarningRunner {
}
