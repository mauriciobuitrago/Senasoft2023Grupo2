package com.co.qvision.tasks;

import com.co.qvision.models.DataCarRental;
import com.co.qvision.models.DataFlight;
import com.co.qvision.userinterfaces.CarRentalPage;
import com.co.qvision.userinterfaces.FligtPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class FlighTask implements Task {

    //variable que nos permite traer los datos de la clase DataWrongLogin
    DataFlight dataFlight;



    // constructor para poder unir la data de modelo login con las tareas e instaciar en los stepdefiniton
    public FlighTask(DataFlight dataFlight) {
        this.dataFlight = dataFlight;
    }

    //damos actividad al actor con cada localizador correspodiente instanciando desde la clase LoginPage
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FligtPage.BTN),
                Click.on(FligtPage.BTN_FLIGHT),
                Click.on(FligtPage.BTN_IMAGE));
        actor.attemptsTo(Click.on(FligtPage.BTN_SEEFLIGHT));try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        actor.attemptsTo(Scroll.to(FligtPage.BTN_NETX));
        actor.attemptsTo(Click.on(FligtPage.BTN_NETX),
                Click.on(FligtPage.BTN_NETXCONTINUED),
                Click.on(FligtPage.BTN_NETXCONTINUED1));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        actor.attemptsTo(Enter.theValue(dataFlight.getName()).into(FligtPage.TXT_NAMEA),
                Enter.theValue(dataFlight.getLastname()).into(FligtPage.TXT_LASTNAME),
                       //Enter.theValue(dataFlight.getLastname()).into(FligtPage.TXXT_LASTNAME),
                       Click.on(FligtPage.BTN_GENDER),
                       Click.on(FligtPage.BTN_SELECTGENDER),
                       Enter.theValue(dataFlight.getDayT()).into(FligtPage.TXT_DAY),
                       Click.on(FligtPage.BTN_SELECT_MONTH),
                       Click.on(FligtPage.BTN_MONTH),
                       Enter.theValue(dataFlight.getYear()).into(FligtPage.TXT_YEARS),
                       Click.on(FligtPage.BTN_LIST),
               // Click.on(FligtPage.BTN_GENDER),
              //  Click.on(FligtPage.BTN_SELECTGENDER),
                Enter.theValue(dataFlight.getName()).into(FligtPage.TXT_NAMEA),
                Enter.theValue(dataFlight.getEmail()).into(FligtPage.TXT_EMAILC),
                Enter.theValue(dataFlight.getPhone()).into(FligtPage.TXT_TEL),
                Enter.theValue(dataFlight.getName()).into(FligtPage.TXXT_NAME),

                Click.on(FligtPage.BTN_NEEXT),
                Click.on(FligtPage.BTN_NEEXT2),

                //SIGUEE


                Enter.theValue(dataFlight.getNametarget()).into(FligtPage.TXT_NAMETARGET),
                Enter.theValue(dataFlight.getNambertarget()).into(FligtPage.TXT_NUMBER_TARGET),
                Enter.theValue(dataFlight.getDay()).into(FligtPage.TXT_EXPIREDTARGET),
                Enter.theValue(dataFlight.getCvc()).into(FligtPage.TXT_CVC),
                Click.on(FligtPage.BTN_SELECT),
                Click.on(FligtPage.BTN_FLIGHT),
                Click.on(FligtPage.BTN_FLIGHT));
        try {Thread.sleep(15000);} catch (InterruptedException e) {throw new RuntimeException(e);}


    }
    //metodo para poder instanciar la clase logintask en los stepdefinion
    public static FlighTask reservation(DataFlight dataFlight)
    {
        return Tasks.instrumented(FlighTask.class,dataFlight);
    }
}
