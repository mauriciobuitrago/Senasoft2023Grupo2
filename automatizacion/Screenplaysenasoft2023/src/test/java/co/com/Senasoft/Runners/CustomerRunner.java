package co.com.Senasoft.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/customer.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.Senasoft.StepsDefinitions",
        strict = false,
        plugin = "pretty"

)
public class CustomerRunner {
}
