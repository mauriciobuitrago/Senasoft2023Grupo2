package com.co.qvision.questions;

import com.co.qvision.userinterfaces.CarRentalPage;
import com.co.qvision.userinterfaces.RegisterIncorrectlyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifyCarRental implements Question<Boolean>{


        // ESTA clase nos permite darle validacion a nuestros escenarios
        @Override
        public Boolean answeredBy(Actor actor) {
            return Visibility.of(CarRentalPage.BTN_SEARCH).viewedBy(actor).asBoolean();
        }
        //metodo para poder instanciar nuestra validacion en los stepsdefinition

        public static VerifyCarRental search(){
            return new VerifyCarRental();
        }
    }


