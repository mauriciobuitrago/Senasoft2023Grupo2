package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.OpenLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenLoginTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OpenLoginPage.BTN_LOGIN));
    }
    public static OpenLoginTasks openLoginTasks(){
        return Tasks.instrumented(OpenLoginTasks.class);
    }
}
