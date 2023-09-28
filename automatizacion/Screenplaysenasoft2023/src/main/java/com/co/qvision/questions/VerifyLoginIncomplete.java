package com.co.qvision.questions;

import com.co.qvision.userinterfaces.LoginImcompletePage;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifyLoginIncomplete implements Question<Boolean> {

    // ESTA clase nos permite darle validacion a nuestros escenarios
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LoginImcompletePage.BTN_).viewedBy(actor).asBoolean();
    }

    //metodo para poder instanciar nuestra validacion en los stepsdefinition

    public static VerifyLoginIncomplete validationImpcomplete(){
        return new VerifyLoginIncomplete();
    }
}
