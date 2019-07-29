package com.aut.pages;

import com.thoughtworks.gauge.Step;

public class OpenHepsiBuradaStepDef {

    @Step("User visits Hepsiburada.com")
    public void visitUserHepsiburada() {
        PageFactory.openHepsiBuradaPage.visitUserHepsiburada();
    }
}
