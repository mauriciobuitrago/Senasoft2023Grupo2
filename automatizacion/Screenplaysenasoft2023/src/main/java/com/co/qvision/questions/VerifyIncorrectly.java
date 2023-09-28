package com.co.qvision.questions;

import com.co.qvision.userinterfaces.RegisterIncorrectlyPage;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifyIncorrectly implements Question<Boolean> {

    // ESTA clase nos permite darle validacion a nuestros escenarios
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(RegisterIncorrectlyPage.BTN_CREATE).viewedBy(actor).asBoolean();
    }
    //metodo para poder instanciar nuestra validacion en los stepsdefinition

    public static VerifyIncorrectly validationregisterIncorrectly(){
        return new VerifyIncorrectly();
    }
}
