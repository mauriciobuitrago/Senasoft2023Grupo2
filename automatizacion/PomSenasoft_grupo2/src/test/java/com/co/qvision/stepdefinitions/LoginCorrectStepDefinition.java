package com.co.qvision.stepdefinitions;

import com.co.qvision.PageObejcts.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.co.qvision.Steps.LoginCorrectStep;
import com.co.qvision.models.CredentialLoginCorrectly;
import org.junit.Assert;

import java.util.List;

public class LoginCorrectStepDefinition {

    @Steps
    LoginCorrectStep loginCorrectStep;


    @Given("^he user enters in the website$")
    public void heUserEntersInTheWebsite() {
        loginCorrectStep.openBrowser();

    }


    @When("^he user enters the website with correct credential$")
    public void heUserEntersTheWebsiteWithCorrectCredential(List<CredentialLoginCorrectly>credentialLoginCorrectlyList) {

        loginCorrectStep.close();
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);
        }
        loginCorrectStep.login();
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);
        }
        loginCorrectStep.email(credentialLoginCorrectlyList.get(0).getEmail());
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);

        }
        loginCorrectStep.continued();
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);
        }
        loginCorrectStep.password(credentialLoginCorrectlyList.get(0).getPassword());
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);
        }
        loginCorrectStep.ingres();
        try {Thread.sleep(3000);} catch (InterruptedException e) {
            throw new RuntimeException(e);


        }
    }


    @Then("^he entry succesfully$")
    public void heEntrySuccesfully() {
     loginCorrectStep.verify();
        System.out.println("Hubo un Login exitoso con validacion correcta");

    }


}
