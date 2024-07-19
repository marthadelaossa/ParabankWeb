package com.parasoft.parabank.stepsDefinitions;

import com.parasoft.parabank.driver.Driver;
import com.parasoft.parabank.questions.ValidacionRegistroUsuarioQuestion;
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


public class InicioSesionStepDefinition {
    DataBaseHandler databaseHandler=new DataBaseHandler();
    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario se encuentra en la pagina (.*) (.*)$")
    public void queElUsuarioSeEncuentraEnLaPagina(String navegador,String url) {
        OnStage.theActorCalled("tester").can(BrowseTheWeb.with(Driver.getDriver(url,navegador)));
    }

    @Cuando("el usuario se registra como usuario")
    public void elUsuarioSeRegistraComoUsuario() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroUsuarioTask.ir());
       }

    @Entonces("el usuario valida la creacion de su usuario exitosamente")
    public void elUsuarioValidaLaCreacionDeSuUsuarioExitosamente()  throws SQLException, ClassNotFoundException {
        Assert.assertTrue("Validacion Creacion Exitosa de Usuario",OnStage.theActorInTheSpotlight().asksFor(ValidacionRegistroUsuarioQuestion.ir()));
        databaseHandler.setDatos();
     }

    @Cuando("^el usuario inicia sesion$")
    public void elUsuarioIniciaSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesionTask.ir());
    }


}
