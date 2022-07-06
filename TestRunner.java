package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\shilp\\IdeaProjects\\untitled\\SimpleBdd FrameWork\\src\\test\\resources\\Feature\\login.feature"
        ,glue = {"StepDefinition"}
        ,dryRun = false

)
public class TestRunner {
}
