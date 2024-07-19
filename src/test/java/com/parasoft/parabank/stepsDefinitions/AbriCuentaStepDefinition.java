package com.parasoft.parabank.stepsDefinitions;

import com.parasoft.parabank.driver.Driver;
import com.parasoft.parabank.questions.ValidacionAbrirCuentaQuestion;
import com.parasoft.parabank.questions.ValidacionRegistroUsuarioQuestion;
import com.parasoft.parabank.task.AbrirCuentaTask;
import com.parasoft.parabank.task.IniciarSesionTask;
import com.parasoft.parabank.task.RegistroUsuarioTask;
import com.parasoft.parabank.utils.DataBaseHandler;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;

import java.sql.SQLException;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;


public class AbriCuentaStepDefinition {

    @Y("el usuario abra una cuenta")
    public void elUsuarioAbraUnaCuenta() {

        OnStage.theActorInTheSpotlight().attemptsTo(AbrirCuentaTask.ir());
    }

    @Entonces("el usuario valida la apertura de la cuenta")
    public void elUsuarioValidaLaAperturaDeLaCuenta() {
        Assert.assertTrue("Validacion Apertura de Cuanta Exitosa",OnStage.theActorInTheSpotlight().asksFor(ValidacionAbrirCuentaQuestion.ir()));
   }


}
