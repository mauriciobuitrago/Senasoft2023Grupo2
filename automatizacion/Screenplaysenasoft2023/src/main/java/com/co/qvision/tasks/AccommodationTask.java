package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AccommodationPage;
import com.co.qvision.userinterfaces.SearchForTypePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.SendKeysIntoBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.yaml.snakeyaml.tokens.Token.ID.Key;


public class AccommodationTask implements Task {
    public static String UrlIG;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SearchForTypePage.SLT_TYPE));
        try {Thread.sleep(5000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(SearchForTypePage.OPT_TYPE));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}


        actor.attemptsTo(Click.on(SearchForTypePage.SLT_OPTION_HOTEL));
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(SearchForTypePage.A_SEE_HOTEL));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}


    }
    public static AccommodationTask accommodationTask(){
        return Tasks.instrumented(AccommodationTask.class);
    }
}
