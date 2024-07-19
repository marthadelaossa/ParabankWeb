package com.parasoft.parabank.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.parasoft.parabank.userInterface.TransferFundsPageUI.LBL_SUCCESS_MESSAGE;

public class ValidacionTransferirFondosQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_SUCCESS_MESSAGE.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> ir (){
        return new ValidacionTransferirFondosQuestion();
    }

}
