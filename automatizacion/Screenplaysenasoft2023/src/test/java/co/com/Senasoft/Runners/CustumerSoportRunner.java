package co.com.Senasoft.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/customersupport.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.Senasoft.StepsDefinitions",
        plugin = "pretty"


)
public class CustumerSoportRunner {

}
