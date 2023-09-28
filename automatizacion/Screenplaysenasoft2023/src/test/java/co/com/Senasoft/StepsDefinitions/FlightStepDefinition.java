package co.com.Senasoft.StepsDefinitions;

import com.co.qvision.models.DataFlight;
import com.co.qvision.questions.Verifyfligh;
import com.co.qvision.tasks.FlighTask;
import com.co.qvision.tasks.LoginCorrecTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class FlightStepDefinition {
    @When("^the user selects a stopover in the “Flights” module and makes the reservation$")
    public void theUserSelectsAStopoverInTheFlightsModuleAndMakesTheReservation(List<DataFlight>dataFlightList) {
        DataFlight dataFlight;
        dataFlight= dataFlightList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(FlighTask.reservation(dataFlight));
    }

    @Then("^the user will be able to see a message about their reservation\\.$")
    public void theUserWillBeAbleToSeeAMessageAboutTheirReservation() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verifyfligh.search()
                , Matchers.is("No completada ")));


    }

}
