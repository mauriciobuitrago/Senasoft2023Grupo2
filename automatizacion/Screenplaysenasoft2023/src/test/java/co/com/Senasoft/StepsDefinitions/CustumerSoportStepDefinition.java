package co.com.Senasoft.StepsDefinitions;

import com.co.qvision.questions.VerifyCustumeSuport;
import com.co.qvision.tasks.CloseMessage;
import com.co.qvision.tasks.CustomeSuportTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class CustumerSoportStepDefinition {

    @When("^the user enters the Customer Service module and selects the service to consult$")
    public void TheUserEntersTheCustomerServiceModuleAndSelectsTheServiceToConsult() {
        OnStage.theActorInTheSpotlight().attemptsTo(CloseMessage.closeMessage());
        OnStage.theActorInTheSpotlight().attemptsTo(CustomeSuportTask.customeSuportTask());
    }


    @Then("^the user will find information about his problem$")
    public void theUserWillFindInformationAboutHisProblem() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyCustumeSuport.verifyCustumeSuport(), Matchers.equalTo(Boolean.TRUE)));
    }
}
