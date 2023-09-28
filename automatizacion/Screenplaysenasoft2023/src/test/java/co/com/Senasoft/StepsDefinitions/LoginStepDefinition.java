package co.com.Senasoft.StepsDefinitions;

import com.co.qvision.models.CredentialLoginCorrectly;
import com.co.qvision.models.DataLoginIncomplete;
import com.co.qvision.models.DataWrongLogin;
import com.co.qvision.questions.VerifyLoginCorrect;
import com.co.qvision.questions.VerifyLoginIncomplete;
import com.co.qvision.questions.VerifyWrongLogin;
import com.co.qvision.questions.Verifyfligh;
import com.co.qvision.tasks.LoginCorrecTask;
import com.co.qvision.tasks.LoginIncompleteTasks;
import com.co.qvision.tasks.RegisterIncorrectlyTask;
import com.co.qvision.tasks.WronLoginTask;
import com.co.qvision.userinterfaces.LoginCorrectPage;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class LoginStepDefinition {
    @When("^he clicks on the login type your credentials incorrectly$")
    public void heClicksOnTheLoginTypeYourCredentialsIncorrectly(List<DataWrongLogin> dataWrongLoginList) {
        DataWrongLogin dataWrongLogin;
        dataWrongLogin=dataWrongLoginList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(WronLoginTask.wronglogin(dataWrongLogin));
    }

    @Then("^So it's a failed login$")
    public void soItSAFailedLogin() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyWrongLogin.veriryWrong()
                , Matchers.equalTo(Boolean.TRUE)));

        System.out.println("Hubo un inicio de sesion Incorrecto con validacion correcta");
    }
    @When("^he clicks on the login and don't fill out a field$")
    public void heClicksOnTheLoginAndDonTFillOutAField(List<DataLoginIncomplete>dataLoginIncompleteList)
    {
    DataLoginIncomplete dataLoginIncomplete;
    dataLoginIncomplete=dataLoginIncompleteList.get(0);
    OnStage.theActorInTheSpotlight().attemptsTo(LoginIncompleteTasks.incomplete(dataLoginIncomplete));
    }


    @Then("^Then not a successful record\\.$")
    public void thenNotASuccessfulRecord() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyLoginIncomplete.validationImpcomplete()
                , Matchers.equalTo(Boolean.TRUE)));

        System.out.println("Hubo un inicio de sesion Incompleto con validacion correcta");

    }
    @When("^he user enters the website with correct credential$")
    public void heUserEntersTheWebsiteWithCorrectCredential(List<CredentialLoginCorrectly>credentialLoginCorrectlyList) {
     CredentialLoginCorrectly credentialLoginCorrectly;
      credentialLoginCorrectly=credentialLoginCorrectlyList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginCorrecTask.incomplete(credentialLoginCorrectly));

    }


    @Then("^he entry succesfully$")
    public void heEntrySuccesfully() {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyLoginCorrect.logincorrect()
                , Matchers.equalTo(Boolean.TRUE)));

        System.out.println("Hubo un inicio de sesion Correcto con validacion correcta");




    }

}
