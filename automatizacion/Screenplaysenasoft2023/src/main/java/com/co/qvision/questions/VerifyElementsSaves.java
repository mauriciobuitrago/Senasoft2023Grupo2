package com.co.qvision.questions;

import com.co.qvision.userinterfaces.AccommodationPage;
import com.co.qvision.userinterfaces.AddElementsToListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifyElementsSaves implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(AddElementsToListPage.VRF_DIV_ELEMENTS).viewedBy(actor).asBoolean();
    }
    public static VerifyElementsSaves verifyElementsSaves(){
        return new VerifyElementsSaves();
    }
}
