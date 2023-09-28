package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AccommodationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AccommodationFailedTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //Aqui comenzamos a usar los elementos que logramos localizar en el Archivo de Accommodation
        //Les asignamos una accion, como de recibir texto o u click

        actor.attemptsTo(Click.on(AccommodationPage.BTN_IGNORE));
        actor.attemptsTo(Click.on(AccommodationPage.BTN_PERSONS));
        actor.attemptsTo(Click.on(AccommodationPage.SPAN_ADULTS));
        actor.attemptsTo(Click.on(AccommodationPage.SPAN_CHILDREN));
        //Este metodo se usa para controlar el tiempo entre cada  paso se realise para que la automatizacion se un poco mas pausada
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(AccommodationPage.SLT_EDAD_1));
        actor.attemptsTo(Click.on(AccommodationPage.OPT_EDAD_1));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(AccommodationPage.SPAN_ROMS));
        actor.attemptsTo(Click.on(AccommodationPage.BTN_DONE));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(AccommodationPage.BTN_SEARCH));
    }
    public static AccommodationFailedTask accommodationFailedTask(){
        return Tasks.instrumented(AccommodationFailedTask.class);
    }
}
