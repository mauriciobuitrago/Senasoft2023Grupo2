package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AccommodationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CloseMessage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AccommodationPage.BTN_IGNORE));
    }

    public static CloseMessage closeMessage(){
        return Tasks.instrumented(CloseMessage.class);
    }
}
