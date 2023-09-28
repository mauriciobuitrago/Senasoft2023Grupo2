package com.co.qvision.questions;

import com.co.qvision.userinterfaces.CustomerSoportPage;
import com.co.qvision.userinterfaces.CustumerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifyCustumeSuport implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(CustomerSoportPage.VRF_INFO).viewedBy(actor).asBoolean();
    }
    public static VerifyCustumeSuport verifyCustumeSuport(){
        return new VerifyCustumeSuport();
    }
}
