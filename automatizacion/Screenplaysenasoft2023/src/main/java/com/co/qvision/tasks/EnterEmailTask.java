package com.co.qvision.tasks;

import com.co.qvision.models.CredentialLoginCorrectly;
import com.co.qvision.userinterfaces.OpenLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterEmailTask implements Task {
    CredentialLoginCorrectly credentialLoginCorrectly;

    public EnterEmailTask(CredentialLoginCorrectly credentialLoginCorrectly) {
        this.credentialLoginCorrectly = credentialLoginCorrectly;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentialLoginCorrectly.getEmail()).into(OpenLoginPage.TXT_EMAIL_));
        actor.attemptsTo(Click.on(OpenLoginPage.BTN_CONTINUAR));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Enter.theValue(credentialLoginCorrectly.getPassword()).into(OpenLoginPage.TXT_PASS));
        actor.attemptsTo(Click.on(OpenLoginPage.BTN_ENTER));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static EnterEmailTask enterEmailTask(CredentialLoginCorrectly credentialLoginCorrectly){
        return Tasks.instrumented(EnterEmailTask.class,credentialLoginCorrectly);
    }
}
