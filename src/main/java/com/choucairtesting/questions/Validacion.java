package com.choucairtesting.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.choucairtesting.userInterfaces.LocalizadoresUI.*;

public class Validacion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return IMG_LOGOCHOUCAIR.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> validacion() {
        return new Validacion();
    }
}