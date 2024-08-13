package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraMenuPrincipalObject;
import net.thucydides.core.annotations.Step;

public class IntegraMenuPrincipalStep {
    IntegraMenuPrincipalObject integraMenuPrincipalObject;

    @Step
    public void clickCatalogo() {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).click();
    }

    @Step
    public void clickTasasDiaras() {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnLimites()).click();
    }
}
