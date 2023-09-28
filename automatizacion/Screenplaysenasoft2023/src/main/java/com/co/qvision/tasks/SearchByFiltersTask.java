package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AccommodationForFiltres;
import com.co.qvision.userinterfaces.AccommodationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SearchByFiltersTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(AccommodationForFiltres.DIV_FILTRES_PRICE));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Scroll.to(AccommodationForFiltres.DIV_FILTRES_POPULAR));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(AccommodationForFiltres.SLT_FILTER_1),Scroll.to(AccommodationForFiltres.SLT_FILTER_2));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(AccommodationForFiltres.SLT_FILTER_2),Scroll.to(AccommodationForFiltres.SLT_FILTER_3));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(AccommodationForFiltres.SLT_FILTER_3));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(AccommodationForFiltres.SEE_PRODUCT));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Scroll.to(AccommodationForFiltres.SEE_PRODUCT));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}



    }
    public static SearchByFiltersTask searchByFiltersTask(){
        return Tasks.instrumented(SearchByFiltersTask.class);
    }
}
