package com.co.qvision.tasks;

import com.co.qvision.models.DataLoginIncomplete;
import com.co.qvision.models.DataRegisterIncorrectly;
import com.co.qvision.userinterfaces.LoginImcompletePage;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginIncompleteTasks  implements Task {

    //variable que nos permite traer los datos de la clase DataWrongLogin
    DataLoginIncomplete dataLoginIncomplete;

    public LoginIncompleteTasks(DataLoginIncomplete dataLoginIncomplete) {
        this.dataLoginIncomplete = dataLoginIncomplete;
    }

    //damos actividad al actor con cada localizador correspodiente instanciando desde la clase LoginPage
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginImcompletePage.BTN),
                Click.on(LoginImcompletePage.BTN_LOGIN),
                Enter.theValue(dataLoginIncomplete.getEmail()).into(LoginImcompletePage.TXT_EMAIL),
                Click.on(LoginImcompletePage.BTN_CONTINUED),
                Click.on(LoginImcompletePage.BTN_));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}


    }
    //metodo para poder instanciar la clase logintask en los stepdefinion
    public static LoginIncompleteTasks incomplete(DataLoginIncomplete dataLoginIncomplete)
    {
        return Tasks.instrumented(LoginIncompleteTasks.class,dataLoginIncomplete);
    }
}
