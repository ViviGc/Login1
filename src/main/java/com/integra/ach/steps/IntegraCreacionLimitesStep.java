package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraCreacionLimitesObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class IntegraCreacionLimitesStep {
    IntegraCreacionLimitesObject integraCreacionLimitesObject;

    @Step
    public void clickBotonMas() {
        integraCreacionLimitesObject.getDriver().findElement(integraCreacionLimitesObject.getBtnMas()).click();
    }

    @Step
    public void escribirId(String id) {
        integraCreacionLimitesObject.getDriver().findElement(integraCreacionLimitesObject.getLblId()).sendKeys(id);
    }

    @Step
    public void escribirNombre(String nombre) {
        integraCreacionLimitesObject.getDriver().findElement(integraCreacionLimitesObject.getLblNombre()).sendKeys(nombre);
    }

    @Step
    public void escribirTopeMinimo(String topeMinimo) {
        integraCreacionLimitesObject.getDriver().findElement(integraCreacionLimitesObject.getLblTopeMinimo()).sendKeys(topeMinimo);
    }

    @Step
    public void escribirTopeMaximo(String topeMaximo) {
        integraCreacionLimitesObject.getDriver().findElement(integraCreacionLimitesObject.getLblTopeMaximo()).sendKeys(topeMaximo);
    }

    @Step
    public void escribirVigenciaCuenta(String vigenciaDeLaCuenta) {
        integraCreacionLimitesObject.getDriver().findElement(integraCreacionLimitesObject.getLblVigenciaDeCuentas()).sendKeys(vigenciaDeLaCuenta);
    }

    @Step
    public void escribirPendiente(String pendiente) {
        integraCreacionLimitesObject.getDriver().findElement(integraCreacionLimitesObject.getLblPendientes()).sendKeys(pendiente);
    }

    @Step
    public void escribirPreaviso(String preaviso) {
        integraCreacionLimitesObject.getDriver().findElement(integraCreacionLimitesObject.getLblPreAviso()).sendKeys(preaviso);
    }

    @Step
    public void seleccionarCuentaAutomatizadas(String cuentaAutomatizadas) {
        integraCreacionLimitesObject.getDriver().findElement(By.xpath("(//*[text()='" + cuentaAutomatizadas + "'])[2]")).click();
    }

    @Step
    public void seleccionarMontoEspecial(String montoEspecial) {
        integraCreacionLimitesObject.getDriver().findElement(By.xpath("(//*[text()='" + montoEspecial + "'])[3]")).click();
    }

    @Step
    public void seleccionarMontoMinimo(String montoMinimoRequerido) {
        integraCreacionLimitesObject.getDriver().findElement(By.xpath("(//*[text()='" + montoMinimoRequerido + "'])[4]")).click();
    }
    @Step
    public void seleccionarTipoTransacciones(String tipoDeTransacciones) {
        integraCreacionLimitesObject.getDriver().findElement(integraCreacionLimitesObject.getBtnTipoDeTansacciones()).sendKeys(tipoDeTransacciones);
    }
    @Step
    public void seleccionarEstado(String tipoDeTransacciones) {
        integraCreacionLimitesObject.getDriver().findElement(integraCreacionLimitesObject.getBtnTipoDeTansacciones()).sendKeys(tipoDeTransacciones);
    }
}
