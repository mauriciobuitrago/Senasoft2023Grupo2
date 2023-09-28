package com.co.qvision.questions;

import com.co.qvision.userinterfaces.RegisterPage;
import com.co.qvision.userinterfaces.WronLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifyWrongLogin  implements Question<Boolean>{

    // ESTA clase nos permite darle validacion a nuestros escenarios
        @Override
        public Boolean answeredBy(Actor actor) {
        return Visibility.of(WronLoginPage.BTN_CONTINUED).viewedBy(actor).asBoolean();
    }

        //metodo para poder instanciar nuestra validacion en los stepsdefinition

        public static VerifyWrongLogin veriryWrong(){
        return new VerifyWrongLogin();
    }


}
