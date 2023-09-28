package com.co.qvision.tasks;

import com.co.qvision.models.CredentialLoginCorrectly;
import com.co.qvision.models.DataLoginIncomplete;
import com.co.qvision.userinterfaces.LoginCorrectPage;
import com.co.qvision.userinterfaces.LoginImcompletePage;
import com.gargoylesoftware.htmlunit.javascript.host.security.Credential;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginCorrecTask implements Task {

    //variable que nos permite traer los datos de la clase DataWrongLogin
    CredentialLoginCorrectly credentialLoginCorrectly;
    // constructor para poder unir la data de modelo login con las tareas e instaciar en los stepdefiniton
    public LoginCorrecTask(CredentialLoginCorrectly credentialLoginCorrectly) {
        this.credentialLoginCorrectly = credentialLoginCorrectly;
    }

    //damos actividad al actor con cada localizador correspodiente instanciando desde la clase LoginPage
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginCorrectPage.BTN),
                Click.on(LoginCorrectPage.BTN_LOGIN),
                Enter.theValue(credentialLoginCorrectly.getEmail()).into(LoginCorrectPage.TXT_EMAIL),
                Click.on(LoginCorrectPage.BTN_CONTINUED),
                Enter.theValue(credentialLoginCorrectly.getPassword()).into(LoginCorrectPage.TXT_PASSWORD),
                Click.on(LoginCorrectPage.BTN_SEND));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}



    }
    //metodo para poder instanciar la clase logintask en los stepdefinion
    public static LoginCorrecTask incomplete(CredentialLoginCorrectly credentialLoginCorrectly)
    {
        return Tasks.instrumented(LoginCorrecTask.class,credentialLoginCorrectly);
    }
}
