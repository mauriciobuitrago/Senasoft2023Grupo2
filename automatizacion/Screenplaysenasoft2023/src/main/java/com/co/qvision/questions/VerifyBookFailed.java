package com.co.qvision.questions;

import com.co.qvision.userinterfaces.AccommodationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifyBookFailed implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(AccommodationPage.TXT_ERROR).viewedBy(actor).asBoolean();
    }
    public static VerifyBookFailed verifyBookFailed(){
        return new VerifyBookFailed();
    }
}
