package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraMenuPrincipalObject extends PageObject {
    By btnCatalogos = By.xpath("//span[contains(text(),'Catálogos')]");
    By btnLimites = By.xpath("//span[contains(text(),'Límites')]");

    public By getBtnCatalogos() {
        return btnCatalogos;
    }

    public By getBtnLimites() {
        return btnLimites;
    }
}
