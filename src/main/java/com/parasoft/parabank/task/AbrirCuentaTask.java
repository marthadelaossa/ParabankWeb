package com.parasoft.parabank.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.parasoft.parabank.userInterface.OpenAccountPageUI.*;
import static com.parasoft.parabank.utils.Datos.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class AbrirCuentaTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(LINK_OPEN_NEW_ACCOUNT, isClickable()).forNoMoreThan(30).seconds(),
                    Click.on(LINK_OPEN_NEW_ACCOUNT)
            );

            actor.attemptsTo(
                    WaitUntil.the(SLT_TYPE_ACCOUNT,isEnabled()).forNoMoreThan(30).seconds(),
                    SelectFromOptions.byIndex(1).from(SLT_TYPE_ACCOUNT),
                    Click.on(BTN_OPEN_NEW_ACCOUNT)
            );

        }
public static Performable ir () {
        return Instrumented.instanceOf(AbrirCuentaTask.class).withProperties();
    }
}