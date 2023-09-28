package com.co.qvision.interactions;

import com.co.qvision.userinterfaces.AccommodationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CloseMessagee implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AccommodationPage.BTN_IGNORE));
    }

    public static CloseMessagee closeMessage(){
        return Tasks.instrumented(CloseMessagee.class);
    }
}
