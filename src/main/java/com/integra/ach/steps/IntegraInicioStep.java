package com.integra.ach.steps;


import com.integra.ach.pageObject.IntegraInicioObject;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Utilidades;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class IntegraInicioStep {
    IntegraInicioObject integraInicioObject;
    EsperaImplicita esperaImplicita;

    @Step
    public void abrirWeb() {
        integraInicioObject.open();
    }

    @Step
    public void seleccionarTipoEntidad() {
        integraInicioObject.getDriver().findElement(integraInicioObject.getBtnSelect()).click();
        integraInicioObject.getDriver().findElement(integraInicioObject.getOptTipoEntidad()).click();
    }

    @Step
    public void clickBotonVamos() {
        integraInicioObject.getDriver().findElement(integraInicioObject.getBtnVamos()).click();
    }

    @Step
    public void escribirUsuarioYContrasena(String usuario, String clave) {
        integraInicioObject.getDriver().findElement(integraInicioObject.getLblUsuario()).sendKeys(usuario);
        integraInicioObject.getDriver().findElement(integraInicioObject.getLblContraseña()).sendKeys(clave);
    }

    @Step
    public void clickIngresar() {
        Utilidades.esperarExplicito30( integraInicioObject.getDriver(),integraInicioObject.getBtnIngresar());
        Utilidades.esperar(5000);
        integraInicioObject.getDriver().findElement(integraInicioObject.getBtnIngresar()).click();
    }

    @Step
    public void validarInicioDeSesionExitoso() {
        Utilidades.esperarExplicito30( integraInicioObject.getDriver(),integraInicioObject.getTxtBienvenido());
        Utilidades.esperar(5000);
        Assert.assertTrue(integraInicioObject.getDriver().findElement(integraInicioObject.getTxtBienvenido()).getText(), true);
    }

    @Step
    public void validarInicioDeSesionFallidoCredenciales() {
        Utilidades.esperar(5000);
        Assert.assertTrue(integraInicioObject.getDriver().findElement(integraInicioObject.getTxtDatosNoValidos()).getText(), true);
    }

    @Step
    public void validarInicioDeSesionFallidoBloqueado() {

        Utilidades.esperar(5000);
        Assert.assertTrue(integraInicioObject.getDriver().findElement(integraInicioObject.getTxtDatosNoValidos()).getText(), true);
    }

    @Step
    public void validarInicioDeSesionFallidoUsuarioNoRegistrado() {

        Utilidades.esperar(5000);
        Assert.assertTrue(integraInicioObject.getDriver().findElement(integraInicioObject.getTxtDatosNoValidos()).getText(), true);
    }

}
