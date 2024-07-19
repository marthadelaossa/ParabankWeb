package com.parasoft.parabank.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.parasoft.parabank.userInterface.TransferFundsPageUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class TransferirFondosTask implements Task {

    String monto;

    public TransferirFondosTask(String monto) {
        this.monto = monto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(LINK_TRANSFER_FUNDS, isClickable()).forNoMoreThan(30).seconds(),
                    Click.on(LINK_TRANSFER_FUNDS)
            );

            actor.attemptsTo(
                    WaitUntil.the(SLT_FROM_ACCOUNT_ID,isEnabled()).forNoMoreThan(30).seconds(),
                    Click.on(SLT_FROM_ACCOUNT_ID),
                    WaitUntil.the(OPT_FROM_ACCOUNT_ID,isEnabled()).forNoMoreThan(30).seconds(),
                    Click.on(OPT_FROM_ACCOUNT_ID),
                    Click.on(SLT_TO_ACCOUNT_ID),
                    WaitUntil.the(OPT_TO_ACCOUNT_ID,isEnabled()).forNoMoreThan(30).seconds(),
                    Click.on(OPT_TO_ACCOUNT_ID),
                    Enter.theValue(monto).into(INPUT_AMOUNT),
                    Click.on(BTN_TRANSFER)
            );

        }
public static Performable ir (String monto) {
        return Instrumented.instanceOf(TransferirFondosTask.class).withProperties(monto);
    }
}