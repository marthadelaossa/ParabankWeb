package com.parasoft.parabank.questions;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.HtmlAlert;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.parasoft.parabank.userInterface.RegisterPageUI.LBL_ACCOUNT_CREATED;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class ValidacionRegistroUsuarioQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_ACCOUNT_CREATED.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> ir (){
        return new ValidacionRegistroUsuarioQuestion();
    }

}
