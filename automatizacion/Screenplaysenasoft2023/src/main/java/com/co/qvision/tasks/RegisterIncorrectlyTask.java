package com.co.qvision.tasks;

import com.co.qvision.models.DataRegister;
import com.co.qvision.models.DataRegisterIncorrectly;
import com.co.qvision.userinterfaces.RegisterIncorrectlyPage;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterIncorrectlyTask implements Task {

    DataRegisterIncorrectly dataRegisterIncorrectly;
    // constructor para poder unir la data de modelo login con las tareas e instaciar en los stepdefiniton

    public RegisterIncorrectlyTask(DataRegisterIncorrectly dataRegisterIncorrectly) {
        this.dataRegisterIncorrectly = dataRegisterIncorrectly;
    }

    //damos actividad al actor con cada localizador correspodiente instanciando desde la clase LoginPage
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterPage.BTN),
                Click.on(RegisterIncorrectlyPage.BTN_REGISTER),
                Enter.theValue(dataRegisterIncorrectly.getEmail()).into(RegisterIncorrectlyPage.TXT_EMAIL),
                Click.on(RegisterIncorrectlyPage.BTN_CONTINUED));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}

    }
    //metodo para poder instanciar la clase logintask en los stepdefinion
    public static RegisterIncorrectlyTask registerincorrectly(DataRegisterIncorrectly dataRegisterIncorrectly)
    {
        return Tasks.instrumented(RegisterIncorrectlyTask.class,dataRegisterIncorrectly);
    }
}
