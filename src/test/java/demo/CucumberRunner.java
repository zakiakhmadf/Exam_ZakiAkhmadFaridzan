package demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // cucumber features directory
        features = "src/test/resources/features",
        // for html report
        plugin = {"html:build/result"},
        stepNotifications = true,
        tags = {"@Mewtwo"}
)
public class CucumberRunner {
}
