package com.co.qvision.tasks;

import com.co.qvision.models.DataRegister;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.sql.Driver;

public class RegisterTask implements Task {

    DataRegister dataRegister;

    // constructor para poder unir la data de modelo login con las tareas e instaciar en los stepdefiniton
    public RegisterTask(DataRegister dataRegister) {
        this.dataRegister = dataRegister;
    }

    //damos actividad al actor con cada localizador correspodiente instanciando desde la clase LoginPage
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterPage.BTN),
                Click.on(RegisterPage.BTN_REGISTER),
                Enter.theValue(dataRegister.getEmail()).into(RegisterPage.TXT_EMAIL),
                Click.on(RegisterPage.BTN_CONTINUED),
                Enter.theValue(dataRegister.getPassword()).into(RegisterPage.TXT_PASSWORD),
                Enter.theValue(dataRegister.getConfirmation_password()).into(RegisterPage.TXT_CONFIRMED_PAASWORD),
                Click.on(RegisterPage.BTN_CREATE));



    }
    //metodo para poder instanciar la clase logintask en los stepdefinion
    public static RegisterTask register(DataRegister dataRegister)
    {
        return Tasks.instrumented(RegisterTask.class,dataRegister);
    }
}
