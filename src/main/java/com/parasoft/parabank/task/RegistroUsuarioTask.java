package com.parasoft.parabank.task;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.parasoft.parabank.userInterface.MainPageUI.*;
import static com.parasoft.parabank.userInterface.RegisterPageUI.*;
import static com.parasoft.parabank.userInterface.RegisterPageUI.INPUT_PASSWORD;
import static com.parasoft.parabank.userInterface.RegisterPageUI.INPUT_USERNAME;
import static com.parasoft.parabank.utils.Datos.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyEnabled;


public class RegistroUsuarioTask implements Task {

    private String userNameGet;
    private String passwordGet;

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(LNK_MENU_REGISTER, isClickable()).forNoMoreThan(30).seconds(),
                    Click.on(LNK_MENU_REGISTER)
            );
            actor.attemptsTo(
                    WaitUntil.the(BTN_REGISTER, isClickable()).forNoMoreThan(30).seconds(),
                    Enter.theValue(firstName).into(INPUT_FIRSTNAME),
                    Enter.theValue(lastName).into(INPUT_LASTNAME),
                    Enter.theValue(address).into(INPUT_ADDRESS),
                    Enter.theValue(city).into(INPUT_CITY),
                    Enter.theValue(state).into(INPUT_STATE),
                    Enter.theValue(zipCode).into(INPUT_ZIPCODE),
                    Enter.theValue(phone).into(INPUT_TELEPHONE),
                    Enter.theValue(SSN).into(INPUT_SSN)
            );
            userNameGet=userName;
            actor.remember("userName",userNameGet);
            passwordGet=password;
            actor.remember("password",passwordGet);
            actor.attemptsTo(
                    Enter.theValue(userNameGet).into(INPUT_USERNAME),
                    Enter.theValue(passwordGet).into(INPUT_PASSWORD),
                    Enter.theValue(passwordGet).into(INPUT_CONFIRM_PASSWORD),
                    Click.on(BTN_REGISTER),
                    WaitUntil.the(BTN_REGISTER, isNotCurrentlyEnabled()).forNoMoreThan(30).seconds()
            );

        }
public static Performable ir () {
        return Instrumented.instanceOf(RegistroUsuarioTask.class).withProperties();
    }
}