package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\shilp\\IdeaProjects\\untitled\\NewBddFrameWork\\src\\test\\resources\\Feature\\registration.feature"
        ,glue = {"StepDefinition"}
        ,dryRun = false

)
public class TestRunner1 {
}
