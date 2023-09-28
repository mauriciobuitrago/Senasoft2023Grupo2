package co.com.Senasoft.StepsDefinitions;

import com.co.qvision.models.CredentialLoginCorrectly;
import com.co.qvision.models.DataAccommodation;
import com.co.qvision.questions.VerifyBookFailed;
import com.co.qvision.questions.VerifyElementsSaves;
import com.co.qvision.questions.VerifyResultFilter;
import com.co.qvision.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;


import java.util.List;

public class AccommodationStepDefinition {
    @Managed
    WebDriver webDriver;

    public static String handle;


    @Before
    public void setup() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));
    }

    @Given("^the user Enter the website$")
    public void theUserEnterTheWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.booking.com/"));

    }

    @When("^he clicks on the Accommodations option$")
    public void heClicksOnTheAccommodationsOption(List<DataAccommodation>dataAccommodationList) {
        DataAccommodation dataAccommodation;
        dataAccommodation=dataAccommodationList.get(1);

        OnStage.theActorInTheSpotlight().attemptsTo(CloseMessage.closeMessage());
        OnStage.theActorInTheSpotlight().attemptsTo(SearchAccommodationTasks.searchAccommodationTasks(dataAccommodation));


        // creamos una variable que nos permita almacenar la url de una pestaña y la podamos imprimir en consola

        handle = webDriver.getWindowHandle();

        System.out.println("URL DE LA VENTANA "+handle);

        // webDriver.switchTo().window(handle);

        OnStage.theActorInTheSpotlight().attemptsTo(AccommodationTask.accommodationTask());

    }

    @When("^the search and select one of the results$")
    public void theSearchAndSelectOneOfTheResults() {

    }


    @Then("^he will have reserved a place of accommodation$")
    public void heWillHaveReservedAPlaceOfAccommodation() {

    }
    //----------------------------------------------------------------------------------------------------------------


    //----Los siguientes pasos o acciones son aquellas que fueron diseñadas para crear una prueba orientada a la falla,
    //es decir que cuando no se ingrese los datos completos, aqui validemos que aparece un mensaje

    @When("^he clicks on the \"([^\"]*)\" option and writes the incomplete specifications$")
    public void heClicksOnTheOptionAndWritesTheIncompleteSpecifications(String arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(AccommodationFailedTask.accommodationFailedTask());
     //   Switch.toWindow();
    }

    @Then("^he will see an incomplete field message$")
    public void heWillSeeAnIncompleteFieldMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBookFailed.verifyBookFailed(), Matchers.equalTo(Boolean.TRUE)));

    }

    //----------------------------------------------------------------------------------------------------------------------------------------------
    @When("^the is in the Results module and select several filters$")
    public void theIsInTheResultsModuleAndSelectSeveralFilters(List<DataAccommodation>dataAccommodationList) {
        DataAccommodation dataAccommodation;
        dataAccommodation=dataAccommodationList.get(0);

        OnStage.theActorInTheSpotlight().attemptsTo(CloseMessage.closeMessage());
        OnStage.theActorInTheSpotlight().attemptsTo(SearchAccommodationTasks.searchAccommodationTasks(dataAccommodation));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        OnStage.theActorInTheSpotlight().attemptsTo(SearchByFiltersTask.searchByFiltersTask());



    }


    @Then("^He will see the new results obtained by applying the filters$")
    public void heWillSeeTheNewResultsObtainedByApplyingTheFilters() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyResultFilter.verifyResultFilter(),Matchers.equalTo(Boolean.TRUE)));

    }
}
