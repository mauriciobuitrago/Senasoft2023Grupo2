package com.co.qvision.questions;

import com.co.qvision.userinterfaces.OpenLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.apache.xpath.operations.Bool;

public class VerifyElementDelete implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(OpenLoginPage.VLT_BUTTON).viewedBy(actor).asBoolean();
    }
    public static VerifyElementDelete verifyElementDelete(){
        return new VerifyElementDelete();
    }
}
