package com.co.qvision.questions;

import com.co.qvision.userinterfaces.CustumerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifyModuleCustumer implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(CustumerPage.CONTENEDOR_VLT).viewedBy(actor).asBoolean();
    }
    public static VerifyModuleCustumer verifyMessaggeSend(){
        return new VerifyModuleCustumer();
    }
}
