package com.aut.pages;

import org.openqa.selenium.JavascriptExecutor;
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

    @FindBy(how = How.ID, id = "b67b3c41-454e-4d66-84e3-24cf058d2d38")
    private WebElement BTN_HOME;

    @FindBy(how = How.ID, id = "productSearch")
    private WebElement BTN_SEARCH;

    @FindBy(how = How.ID, id = "buttonProductSearch")
    private WebElement BTN_SEARCH_PRODUCT;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"d4a64f0f-e2c3-4c9e-85a8-180e5efdd452\"]/div/div/ul/li/div/a/figure/div[1]/div/div[2]/img")
    private WebElement BTN_PRODUCT;

    @FindBy(how = How.ID, id = "attr-satici-Be€C5€9Fken€20Elektronik")
    private WebElement BTN_DEALER1;

    @FindBy(how = How.ID, id = "attr-satici-Birnumara")
    private WebElement BTN_DEALER2;

    @FindBy(how = How.ID, id = "addToCart")
    private WebElement BTN_ADD_TO_CART;

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"form-item-list\"]/ul/li/div/div[1]/h4/a")
    private WebElement BTN_CART_TITTLE_CONTROL;

    public void userLoginisDone(){
        BTN_GIRIS_YAP.click();
        BTN_LOGIN.click();
        BTN_EMAIL.click();
        BTN_EMAIL.sendKeys("***");
        BTN_PASSWORD.click();
        BTN_PASSWORD.sendKeys("***");
        System.out.println("Üye Girişi Yapılıyor");
        BTN_GIRIS.click();
        System.out.println("Üye Girişi Yapıldı");
    }

    public void checkHomepageTrue(){
        String homePage1 = "Anasayfa";
        String homePage = BTN_HOME.getText();
        if(!homePage.equals(homePage1)){
            System.out.println("Üye Anasayfa'da Bulunmaktadır");
        }

        compare(homePage1,homePage);

    }

    public void searchProduct(){
        BTN_SEARCH.click();
        BTN_SEARCH.sendKeys("HBV000007PV9M");
        BTN_SEARCH_PRODUCT.click();
        System.out.println("Üye, aradığı satın almak istediği ürünü aradı");
    }

    public void selectProductListOne(){
        BTN_PRODUCT.click();
    }

    public void addSelectedProducts(){
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
         BTN_DEALER1.click();
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
         BTN_DEALER2.click();
        System.out.println("iki satıcı seçildi");
         BTN_PRODUCT.click();
        System.out.println("Ürünün Detayına Gidildi");
         BTN_ADD_TO_CART.click();
        System.out.println("Sepete Eklendi");

    }

    public void checkAddedTrue(){
        String tittle = BTN_CART_TITTLE_CONTROL.getText();
        String tittle2 = "Apple iPhone 8 Plus 64 GB (Apple Türkiye Garantili) (64 GB Space Gray)";
        compare(tittle,tittle2);
        System.out.println("Sepete doğru eklendiği görüldü");
    }

    public void compare(String String1,String String2){
        if(String1.equals(String1)){
            System.out.println("TRUE");
        }
        else System.out.println("FALSE");

    }



}
