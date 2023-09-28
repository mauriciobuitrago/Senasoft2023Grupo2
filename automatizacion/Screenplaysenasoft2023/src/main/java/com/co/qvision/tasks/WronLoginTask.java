package com.co.qvision.tasks;

import com.co.qvision.models.DataRegister;
import com.co.qvision.models.DataRegisterIncorrectly;
import com.co.qvision.models.DataWrongLogin;
import com.co.qvision.userinterfaces.RegisterPage;
import com.co.qvision.userinterfaces.WronLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class WronLoginTask implements Task {

    //variable que nos permite traer los datos de la clase DataWrongLogin
   DataWrongLogin dataWrongLogin;

    // constructor para poder unir la data de modelo login con las tareas e instaciar en los stepdefiniton

    public WronLoginTask(DataWrongLogin dataWrongLogin) {
        this.dataWrongLogin = dataWrongLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WronLoginPage.BTN),
                Click.on(WronLoginPage.BTN_LOGIN),
                Enter.theValue(dataWrongLogin.getEmail()).into(WronLoginPage.TXT_EMAIL),
                Click.on(WronLoginPage.BTN_CONTINUED));

    }
    //metodo para poder instanciar la clase logintask en los stepdefinion
    public static WronLoginTask wronglogin(DataWrongLogin dataWrongLogin )
    {
        return Tasks.instrumented(WronLoginTask.class,dataWrongLogin);
    }
}
