package com.aut.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HepsiBuradaLoginPage extends BasePage {


    @FindBy(how = How.ID, id = "myAccount']")
    private WebElement BTN_GIRIS_YAP;

    @FindBy(how = How.ID, id = "login")
    private WebElement BTN_LOGIN;

    @FindBy(how = How.ID, id = "email")
    private WebElement BTN_EMAIL;

    @FindBy(how = How.ID, id = "password")
    private WebElement BTN_PASSWORD;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"form-login\"]/div[4]/button")
    private WebElement BTN_GIRIS;


    public void userLoginisDone(){
        BTN_GIRIS_YAP.click();
        BTN_LOGIN.click();
        BTN_EMAIL.click();
        BTN_EMAIL.sendKeys("namtabaylin@hotmail.com");
        BTN_PASSWORD.click();
        BTN_PASSWORD.sendKeys("zava0808");
        BTN_GIRIS.click();
    }

    public void checkHomepageTrue(){

    }

    public void searchProduct(){

    }

    public void selectProductListOne(){

    }

    public void addSelectedProducts(){

    }

    public void checkAddedTrue(){

    }



}
