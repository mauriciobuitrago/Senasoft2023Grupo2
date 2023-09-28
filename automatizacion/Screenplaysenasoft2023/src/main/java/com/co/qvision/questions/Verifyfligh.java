package com.co.qvision.questions;

import com.co.qvision.userinterfaces.CarRentalPage;
import com.co.qvision.userinterfaces.FligtPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

public class Verifyfligh implements Question<String> {


    // ESTA clase nos permite darle validacion a nuestros escenarios
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FligtPage.VALIDATION).viewedBy(actor).asString();
    }
    //metodo para poder instanciar nuestra validacion en los stepsdefinition

    public static Verifyfligh search(){
        return new Verifyfligh();
    }
}
