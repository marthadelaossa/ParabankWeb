package com.parasoft.parabank.task;

import com.parasoft.parabank.utils.DataBaseHandler;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static com.parasoft.parabank.userInterface.MainPageUI.*;
import static com.parasoft.parabank.userInterface.OpenAccountPageUI.LBL_ACCOUNT_SERVICE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import net.serenitybdd.screenplay.actions.Click;

public class IniciarSesionTask implements Task {

    Map<Integer, Map<String, String>> clientes = new HashMap<>();
    DataBaseHandler databaseHandler=new DataBaseHandler();
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(BTN_LOGIN, isClickable()).forNoMoreThan(30).seconds()
            );
            try {clientes=databaseHandler.getDatos();} catch (SQLException | ClassNotFoundException e) { throw new RuntimeException(e);}
            int sizeClientes=clientes.size();
            int  numero = (int) (Math.random() * sizeClientes) + 1;
            Map<String, String> infoCliente = clientes.get(numero);
            actor.attemptsTo(
                    Enter.theValue(infoCliente.get("userName")).into(INPUT_USERNAME),
                    Enter.theValue(infoCliente.get("password")).into(INPUT_PASSWORD),
                    Click.on(BTN_LOGIN)
            );
            Ensure.that(LBL_ACCOUNT_SERVICE).isDisplayed();
        }
public static Performable ir () {
        return Instrumented.instanceOf(IniciarSesionTask.class).withProperties();
    }
}