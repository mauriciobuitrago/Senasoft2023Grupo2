package co.com.Senasoft.StepsDefinitions;

import com.co.qvision.models.DataCarRental;
import com.co.qvision.models.DataWrongLogin;
import com.co.qvision.questions.VerifyCarRental;
import com.co.qvision.questions.VerifyIncorrectly;
import com.co.qvision.tasks.CarRentalTask;
import com.co.qvision.tasks.WronLoginTask;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import org.junit.runner.RunWith;

import java.util.List;


public class CarRentalStepDefinition {
    @When("^you click on car rental and in the search session fill out the required data$")
    public void youClickOnCarRentalAndInTheSearchSessionFillOutTheRequiredData(List<DataCarRental>dataCarRentalList) {
        DataCarRental dataCarRental ;
        dataCarRental=dataCarRentalList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(CarRentalTask.carrental(dataCarRental));
    }
    @Then("^you make a successful search$")
    public void youMakeASuccessfulSearch() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyCarRental.search()
                , Matchers.equalTo(Boolean.TRUE)));

        System.out.println("Hubo una busqueda exitosa con validacion correcta");

    }
}
