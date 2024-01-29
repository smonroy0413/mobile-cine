package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/LogIn.feature",
        glue = "stepsDefinitions"
        //tags = "@TestOne"
)
public class RunnerTestSuite {
}
