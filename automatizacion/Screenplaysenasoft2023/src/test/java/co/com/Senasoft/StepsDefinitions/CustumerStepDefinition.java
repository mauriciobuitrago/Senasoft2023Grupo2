package co.com.Senasoft.StepsDefinitions;

import com.co.qvision.interactions.CloseMessagee;
import com.co.qvision.models.TextMessage;
import com.co.qvision.questions.VerifyModuleCustumer;
import com.co.qvision.tasks.CloseMessage;
import com.co.qvision.tasks.CustomerSendTasks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class CustumerStepDefinition {
    @When("^The user enters their rating on the website and presses the Submit button$")
    public void theUserEntersTheirRatingOnTheWebsiteAndPressesTheSubmitButton() {

        OnStage.theActorInTheSpotlight().attemptsTo(CloseMessagee.closeMessage());
        OnStage.theActorInTheSpotlight().attemptsTo(CustomerSendTasks.customerSendTasks());
    }


    @Then("^the user will have submitted a rating of the website$")
    public void theUserWillHaveSubmittedARatingOfTheWebsite() {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyModuleCustumer.verifyMessaggeSend(), Matchers.equalTo(Boolean.TRUE)));

    }

}
