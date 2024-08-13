package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraCreacionLimitesObject extends PageObject {
    By btnMas = By.xpath("//*[@Class='fa fa-plus-square']");
    By lblId = By.id("Limits.Id");
    By lblNombre = By.id("Limits.Nombre");
    By lblTopeMinimo = By.id("Limits.TopeMinimo");
    By lblTopeMaximo = By.id("Limits.TopeMinimo");
    By lblVigenciaDeCuentas = By.id("Limits.VigenciadelaCuenta(Dias)");
    By lblPendientes = By.id("Limits.Pendiente(Dias)");
    By lblPreAviso = By.id("Limits.Preaviso(Dias)");

    By chkCuentaAutomatizada = By.id("Limits.Preaviso(Dias)");
    By chkMontoEspecial = By.id("Limits.Preaviso(Dias)");
    By chkMontoMinimoRequerido = By.id("Limits.Preaviso(Dias)");

    By btnTipoDeTansacciones = By.xpath("(//*[@Class='select2-selection__rendered'])[1]");
    By optTipoDeTansacciones = By.xpath("(//*[contains(text(),'23 - Prenotificación crédito a cuenta corriente')])[2]");
    By btnEstado = By.xpath("(//span[@id='select2-{{fieldLabel}}-container']");

    By lblFecha = By.id("Limits.FechaDesde");
    By btnCrear = By.xpath("//*[@Class='btnSuccess btnStyle clr']");

    public By getBtnMas() {
        return btnMas;
    }

    public By getLblId() {
        return lblId;
    }

    public By getLblNombre() {
        return lblNombre;
    }

    public By getLblTopeMinimo() {
        return lblTopeMinimo;
    }

    public By getLblTopeMaximo() {
        return lblTopeMaximo;
    }

    public By getLblVigenciaDeCuentas() {
        return lblVigenciaDeCuentas;
    }

    public By getLblPendientes() {
        return lblPendientes;
    }

    public By getLblPreAviso() {
        return lblPreAviso;
    }

    public By getChkCuentaAutomatizada() {
        return chkCuentaAutomatizada;
    }

    public By getChkMontoEspecial() {
        return chkMontoEspecial;
    }

    public By getChkMontoMinimoRequerido() {
        return chkMontoMinimoRequerido;
    }

    public By getBtnTipoDeTansacciones() {
        return btnTipoDeTansacciones;
    }

    public By getOptTipoDeTansacciones() {
        return optTipoDeTansacciones;
    }

    public By getBtnEstado() {
        return btnEstado;
    }

    public By getLblFecha() {
        return lblFecha;
    }

    public By getBtnCrear() {
        return btnCrear;
    }
}
