package com.parasoft.parabank.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.parasoft.parabank.userInterface.OpenAccountPageUI.LBL_SUCCESS_MESSAGE;

public class ValidacionAbrirCuentaQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_SUCCESS_MESSAGE.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> ir (){
        return new ValidacionAbrirCuentaQuestion();
    }

}
