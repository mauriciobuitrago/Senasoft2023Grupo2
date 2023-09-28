package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.CustomerSoportPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class CustomeSuportTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(CustomerSoportPage.A_HELP));
        actor.attemptsTo(Click.on(CustomerSoportPage.A_HELP));
        actor.attemptsTo(Scroll.to(CustomerSoportPage.NAV_OPTIONS));
        actor.attemptsTo(Click.on(CustomerSoportPage.SLT_ITEM));
        actor.attemptsTo(Click.on(CustomerSoportPage.SLT_PROBLEM));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static CustomeSuportTask customeSuportTask(){
        return Tasks.instrumented(CustomeSuportTask.class);
    }
}
