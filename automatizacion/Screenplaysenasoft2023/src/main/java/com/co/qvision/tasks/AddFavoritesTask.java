package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AccommodationPage;
import com.co.qvision.userinterfaces.AddElementsToListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class AddFavoritesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(AddElementsToListPage.ADD_SAVE_LIST_1), Scroll.to(AddElementsToListPage.ADD_SAVE_LIST_2));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(AddElementsToListPage.ADD_SAVE_LIST_2));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

    }
    public  static AddFavoritesTask addFavoritesTask(){
        return Tasks.instrumented(AddFavoritesTask.class);
    }
}
