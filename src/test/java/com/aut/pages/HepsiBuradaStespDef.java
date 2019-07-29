package com.aut.pages;


import com.thoughtworks.gauge.Step;

public class HepsiBuradaStespDef {

    @Step("User login is done")
    public void userLoginisDone() {
        PageFactory.hepsiBuradaLoginPage.userLoginisDone();
    }

    @Step("After login, user login is verified on the homepage")
    public void checkHomepageTrue() {
        PageFactory.hepsiBuradaLoginPage.checkHomepageTrue();
    }

    @Step("The user will search here for the product he wants to buy")
    public void searchProduct() {
        PageFactory.hepsiBuradaLoginPage.searchProduct();
    }

    @Step("The user selects the product from the product list (or may have returned a single result) displayed on the Search result")
    public void selectProductListOne() {
        PageFactory.hepsiBuradaLoginPage.selectProductListOne();
    }

    @Step("Two different vendor products are selected for the selected product and added to the basket")
    public void addSelectedProducts() {
        PageFactory.hepsiBuradaLoginPage.addSelectedProducts();
    }

    @Step("Verify that the selected product is added correctly on the ’Cart’ page")
    public void checkAddedTrue() {
        PageFactory.hepsiBuradaLoginPage.checkAddedTrue();
    }





}

