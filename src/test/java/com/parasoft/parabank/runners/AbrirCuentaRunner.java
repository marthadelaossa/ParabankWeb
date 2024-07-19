package com.parasoft.parabank.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.parasoft.parabank.stepsDefinitions",
        tags = "@CASO2",
        snippets =  CucumberOptions.SnippetType.CAMELCASE)

public class AbrirCuentaRunner {

}
