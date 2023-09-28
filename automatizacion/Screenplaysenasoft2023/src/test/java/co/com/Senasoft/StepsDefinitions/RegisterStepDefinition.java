package co.com.Senasoft.StepsDefinitions;

import com.co.qvision.models.DataRegister;
import com.co.qvision.questions.VerifyBookFailed;
import com.co.qvision.questions.VerifyRegisterCorrect;
import com.co.qvision.tasks.AccommodationFailedTask;

import com.co.qvision.models.DataRegisterIncorrectly;
import com.co.qvision.questions.VerifyIncorrectly;
import com.co.qvision.questions.VerifyRegisterCorrect;
import com.co.qvision.tasks.RegisterIncorrectlyTask;

import com.co.qvision.tasks.RegisterTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepDefinition {


    //@MANAGED es la que nos permite trabajar con el navegador, abrir el navegador
    @Managed
    WebDriver hisBowser;

    //@before es lo que se genera antes de todos los pasos.

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBowser));
    }

    @Given("^he user enters the website$")
    public void heUserEntersTheWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.booking.com/index.es.html?label=es-co-booking-desktop-QLGRvVsXz2aps*_lUmd*1gS652804041077%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-102518000%3Alp1003665%3Ali%3Adec%3Adm&gclid=CjwKCAjwgsqoBhBNEiwAwe5w077TiV0TUdUzYfYh1-6VJKeaKbN97OQud8lSIPgn5wWrkdyjhOGSYRoCtLEQAvD_BwE&aid=2336990&sid=91faa5accfec39eacfbf6ac0adf3e1d7"));

    }


    @When("^he enters correct data$")
    public void heEntersCorrectData(List<DataRegister> dataRegisterList) {
        DataRegister dataRegister;
        dataRegister = dataRegisterList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.register(dataRegister));
    }

    @Then("^he makes a successful record\\.$")
    public void heMakesASuccessfulRecord() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyRegisterCorrect.validationregister()
                , Matchers.equalTo(Boolean.TRUE)));
        System.out.println("Hubo un Registro exitoso con validacion correcta");


    }
    @When("^he enters incorrect data$")
    public void heEntersIncorrectData(List<DataRegisterIncorrectly> dataRegisterIncorrectlyList) {
        DataRegisterIncorrectly dataRegisterIncorrectly;
        dataRegisterIncorrectly=dataRegisterIncorrectlyList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterIncorrectlyTask.registerincorrectly(dataRegisterIncorrectly));
    }


    @Then("^he cannot make a successful registration\\.$")
    public void heCannotMakeASuccessfulRegistration() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyIncorrectly.validationregisterIncorrectly()
            , Matchers.equalTo(Boolean.FALSE)));

        System.out.println("Hubo un Registro Incorrecto con validacion correcta");
    }

}












