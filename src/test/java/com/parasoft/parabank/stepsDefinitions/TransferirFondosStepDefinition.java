package com.parasoft.parabank.stepsDefinitions;

import com.parasoft.parabank.questions.ValidacionAbrirCuentaQuestion;
import com.parasoft.parabank.questions.ValidacionTransferirFondosQuestion;
import com.parasoft.parabank.task.AbrirCuentaTask;
import com.parasoft.parabank.task.TransferirFondosTask;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.Assert;


public class TransferirFondosStepDefinition {

    @Y("^el usuario realiza una transferencia (.*)$")
    public void elUsuarioRealizaUnaTransferenciaMonto(String monto) {
        OnStage.theActorInTheSpotlight().attemptsTo(TransferirFondosTask.ir(monto));
    }

    @Entonces("el usuario valida la transferencia")
    public void elUsuarioValidaLaTransferencia() {
        Assert.assertTrue("Validacion Apertura de Cuanta Exitosa",OnStage.theActorInTheSpotlight().asksFor(ValidacionTransferirFondosQuestion.ir()));
    }
}
