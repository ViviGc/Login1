package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class LoginStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;

    @Given("^Ingresar al portal$")
    public void ingresarAlPortal() {
        integraInicioStep.abrirWeb();
        integraInicioStep.seleccionarTipoEntidad();
        integraInicioStep.clickBotonVamos();
    }

    @When("^Login exitoso \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginExitoso(String tipoDeEntidad, String usuario, String clave)  {
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
    }

    @When("^Login fallido con credenciales incorrectas \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginFallidoCredenciales(String tipoDeEntidad, String usuario, String clave)  {
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
    }

    @When("^Login fallido con usuario bloqueado \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginFallidoUsuarioBloqueado(String tipoDeEntidad, String usuario, String clave) {
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
    }

    @When("^Login fallido usuario no registrado \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void login(String tipoDeEntidad, String usuario, String clave) throws InterruptedException {
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
    }

    @Then("^Valido login exitoso$")
    public void validoLoginExitoso() {
        integraInicioStep.validarInicioDeSesionExitoso();
    }

    @Then("^Valido login fallido con credenciales incorrectas$")
    public void validoLoginFallidaPorCredenciales() {
        integraInicioStep.validarInicioDeSesionFallidoCredenciales();
    }

    @Then("^Valido login fallido con usuario bloqueado$")
    public void validoLoginFallidoPorBloqueo() {
        integraInicioStep.validarInicioDeSesionFallidoBloqueado();
    }

    @Then("^Valido login fallido con usuario no registrado$")
    public void validoLoginFallidoUsuarioNoRegistrado() {
        integraInicioStep.validarInicioDeSesionFallidoUsuarioNoRegistrado();
    }


}
