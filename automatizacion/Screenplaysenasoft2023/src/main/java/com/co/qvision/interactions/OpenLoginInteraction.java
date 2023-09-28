package com.co.qvision.interactions;

import com.co.qvision.userinterfaces.OpenLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenLoginInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OpenLoginPage.BTN_LOGIN));
    }
    public static OpenLoginInteraction openLoginInteraction(){
        return Tasks.instrumented(OpenLoginInteraction.class);
    }
}
