package com.co.qvision.questions;

import com.co.qvision.userinterfaces.LoginCorrectPage;
import com.co.qvision.userinterfaces.LoginImcompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifyLoginCorrect implements Question<Boolean> {

    // ESTA clase nos permite darle validacion a nuestros escenarios
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LoginCorrectPage.BTN_SEND_VLT).viewedBy(actor).asBoolean();
    }

    //metodo para poder instanciar nuestra validacion en los stepsdefinition

    public static VerifyLoginCorrect logincorrect(){
        return new VerifyLoginCorrect();
    }
}
