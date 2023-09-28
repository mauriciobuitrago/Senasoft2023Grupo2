package com.co.qvision.tasks;

import com.co.qvision.models.TextMessage;
import com.co.qvision.userinterfaces.CustumerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CustomerSendTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(CustumerPage.A_COMMENT));
    actor.attemptsTo(Click.on(CustumerPage.BTN_CUSTUME));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static CustomerSendTasks customerSendTasks(){
        return Tasks.instrumented(CustomerSendTasks.class);
    }
}
