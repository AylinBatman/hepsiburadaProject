package com.aut.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    public final WebDriver driver;
    protected static String Url = System.getenv("APP_ENDPOINT");


    public BasePage(){
        //this.driver = DriverFactory.getDriver();
        this.driver = PageFactory.driver;
    }


}
