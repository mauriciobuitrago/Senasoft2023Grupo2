package com.co.qvision.tasks;

import com.co.qvision.models.CredentialLoginCorrectly;
import com.co.qvision.models.DataCarRental;
import com.co.qvision.models.DataLoginIncomplete;
import com.co.qvision.userinterfaces.CarRentalPage;
import com.co.qvision.userinterfaces.LoginCorrectPage;
import com.co.qvision.userinterfaces.LoginImcompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CarRentalTask implements Task {

    //variable que nos permite traer los datos de la clase DataWrongLogin
    DataCarRental dataCarRental;
    // constructor para poder unir la data de modelo login con las tareas e instaciar en los stepdefiniton


    public CarRentalTask(DataCarRental dataCarRental) {
        this.dataCarRental = dataCarRental;
    }

    //damos actividad al actor con cada localizador correspodiente instanciando desde la clase LoginPage
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CarRentalPage.BTN),
                Click.on(CarRentalPage.BTN_CAR_RENTAL),
                Click.on(CarRentalPage.BTN_CITY),
                Enter.theValue(dataCarRental.getCity()).into(CarRentalPage.TXT_CITY),
                Click.on(CarRentalPage.TXT_CITY2),
                Click.on(CarRentalPage.BTN_DATE),
                Click.on(CarRentalPage.BTN_DAY),
                Click.on(CarRentalPage.BTN_DAY2),
                Click.on(CarRentalPage.BTN_HOUR),
                Click.on(CarRentalPage.BTN_HOUR2),
                Click.on(CarRentalPage.BTN_SEARCH)
                );
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    //metodo para poder instanciar la clase logintask en los stepdefinion
    public static CarRentalTask carrental(DataCarRental dataCarRental)
    {
        return Tasks.instrumented(CarRentalTask.class,dataCarRental);
    }
}
