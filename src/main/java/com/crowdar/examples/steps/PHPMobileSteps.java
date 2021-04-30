package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;

import com.crowdar.examples.pages.PHPContactUsPage;
import com.crowdar.examples.pages.PHPHomePage;
import io.cucumber.java.en.*;

public class PHPMobileSteps extends PageSteps {


    @Given("el usuario se encuentra en la home de la app")
    public void elUsuarioSeEncuentraEnLaHomeDeLaApp() {
        Injector._page(PHPHomePage.class).checkHome();
    }

    @When("el usuario tapea el icono VISA")
    public void elUsuarioTapeaElIconoVISA() {
        //Injector._page(PHPMobileService.class).tapVisa();
    }

    @And("el usuario completa los datos desde {string} hasta {string}")
    public void elUsuarioCompletaLosDatosDesdeHasta(String arg0, String arg1) {
    }

    @And("el usuario completa el campo nombre: {string}, apellido <apellido>, email <email>, celular <celular>, notas <notas>")
    public void elUsuarioCompletaElCampoNombreApellidoApellidoEmailEmailCelularCelularNotasNotas(String arg0) {
    }

    @And("el usuario tapea el boton {string}")
    public void elUsuarioTapeaElBoton(String arg0) {
    }

    @Then("el usuario verifica que se realizo correctamente la reserva")
    public void elUsuarioVerificaQueSeRealizoCorrectamenteLaReserva() {
    }
}
