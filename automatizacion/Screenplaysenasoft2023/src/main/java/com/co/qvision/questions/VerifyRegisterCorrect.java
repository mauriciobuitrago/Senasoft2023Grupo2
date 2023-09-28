package com.co.qvision.questions;

import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

// ESTA clase nos permite darle validacion a nuestros escenarios
public class VerifyRegisterCorrect implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(RegisterPage.BTN_CREATE).viewedBy(actor).asBoolean();
    }

    //metodo para poder instanciar nuestra validacion en los stepsdefinition

    public static VerifyRegisterCorrect validationregister(){
        return new VerifyRegisterCorrect();
    }
}
