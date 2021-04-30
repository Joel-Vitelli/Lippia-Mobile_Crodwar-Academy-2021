package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.PHPContactUsPage;
import com.crowdar.examples.pages.PHPHomePage;
import io.cucumber.java.en.*;

public class PHPContactUsSteps extends PageSteps {

    @When("el usuario tapea el menu")
    public void elUsuarioTapeaElMenu() {
        Injector._page(PHPHomePage.class).tapMenu();
    }

    @And("el usuario tapea el boton Contact Us")
    public void elUsuarioTapeaElBotonContactUs() {
        Injector._page(PHPHomePage.class).tapContactUs();
    }

    @And("el usuario ingresa los datos: Name (.*), Email (.*), Subject (.*) y Message (.*)")
    public void elUsuarioIngresaLosDatosNameNameEmailEmailSubjectSubjectYMessageMsj(String name, String email, String subject, String msj) {
        Injector._page(PHPContactUsPage.class).completarFormulario(name, email, subject, msj);
    }

    @And("el usuario tapea el boton final Contact Us")
    public void elUsuarioTapeaElBotonFinalContactUs() {
        Injector._page(PHPContactUsPage.class).tapFinalContactUs();
    }

    @Then("el usuario verifica mensaje de confirmacion")
    public void elUsuarioVerificaMensajeDeConfirmacion() {
    }
}
