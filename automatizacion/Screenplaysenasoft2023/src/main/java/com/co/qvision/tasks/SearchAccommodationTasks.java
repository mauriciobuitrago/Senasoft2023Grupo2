package com.co.qvision.tasks;

import com.co.qvision.models.DataAccommodation;
import com.co.qvision.userinterfaces.AccommodationPage;
import com.co.qvision.userinterfaces.SearchForTypePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAccommodationTasks implements Task {

    DataAccommodation dataAccommodation;

    public SearchAccommodationTasks(DataAccommodation dataAccommodation) {
        this.dataAccommodation = dataAccommodation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Aqui comenzamos a usar los elementos que logramos localizar en el Archivo de Accommodation
        //Les asignamos una accion, como de recibir texto o u vlick

        //Este metodo se usa para controlar el tiempo entre cada  paso se realise para que la automatizacion se un poco mas pausada

        actor.attemptsTo(Enter.keyValues(dataAccommodation.getCity()).into(AccommodationPage.TXT_PLACE));

        actor.attemptsTo(Click.on(AccommodationPage.SPAN_DATE));
        actor.attemptsTo(Click.on(AccommodationPage.TXT_CHECK_IN));
        actor.attemptsTo(Click.on(AccommodationPage.TXT_CHECK_OUT));
        actor.attemptsTo(Click.on(AccommodationPage.SPAN_DATE));

        actor.attemptsTo(Click.on(AccommodationPage.BTN_PERSONS));
        actor.attemptsTo(Click.on(AccommodationPage.SPAN_ADULTS));

        actor.attemptsTo(Click.on(AccommodationPage.SPAN_CHILDREN));
        actor.attemptsTo(Click.on(AccommodationPage.SPAN_CHILDREN));


        actor.attemptsTo(Click.on(AccommodationPage.SPAN_ROMS));

        actor.attemptsTo(Click.on(AccommodationPage.SLT_EDAD_1));
        actor.attemptsTo(Click.on(AccommodationPage.OPT_EDAD_1));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Click.on(AccommodationPage.SLT_EDAD_2));
        actor.attemptsTo(Click.on(AccommodationPage.OPT_EDAD_2));

        actor.attemptsTo(Click.on(AccommodationPage.BTN_DONE));
        actor.attemptsTo(Click.on(AccommodationPage.BTN_SEARCH));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }
    public static SearchAccommodationTasks searchAccommodationTasks(DataAccommodation dataAccommodation ){
        return Tasks.instrumented(SearchAccommodationTasks.class,dataAccommodation);
    }
}
