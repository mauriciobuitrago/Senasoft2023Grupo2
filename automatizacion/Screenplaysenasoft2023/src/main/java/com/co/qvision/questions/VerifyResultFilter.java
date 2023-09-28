package com.co.qvision.questions;

import com.co.qvision.userinterfaces.SearchForTypePage;
import com.sun.media.jfxmedia.events.VideoTrackSizeListener;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.apache.commons.lang3.Validate;

public class VerifyResultFilter implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(SearchForTypePage.A_SEE_HOTEL).viewedBy(actor).asBoolean();
    }
    public static VerifyResultFilter verifyResultFilter(){
        return new VerifyResultFilter();
    }
}
