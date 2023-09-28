package co.com.Senasoft.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/accommodation.feature",
        glue = "co.com.Senasoft.StepsDefinitions",
        snippets = SnippetType.CAMELCASE,
        plugin = "pretty"
        //,
       // tags = "@Reservationbysearch"
)
public class AccommodationRunner {
}
