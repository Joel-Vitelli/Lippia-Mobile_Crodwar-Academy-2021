package com.crowdar.examples.steps;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.Inicio;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class InicioSteps extends PageSteps {

    private Inicio inicio;

    public InicioSteps(SharedDriver driver){
        super(driver);
        inicio = new Inicio(driver);
    }

    @Given("El usuario esta en la Aplicacion ApiDemo")
    public void elClienteEstaEnLaPaginaDeGoogle(){


    }

    @When("El usuario hace click en el menu (.*)")
    public void elClienteIngresaUnaPalabraABuscar(String palabra){
        inicio.clickinMenu(palabra);

    }

    @Then("El usuario ve la app Bouncing balls")
    public void elClienteObservaLaInformacionRelevanteSobreCrowdar(){

    }
}
