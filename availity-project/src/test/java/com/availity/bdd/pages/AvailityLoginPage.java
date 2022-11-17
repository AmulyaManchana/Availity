package com.availity.bdd.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://opensource-demo.orangehrmlive.com")
public class AvailityLoginPage extends PageObject {

    private WebElementFacade username = $(By.id("username"));

    private WebElementFacade password = $(By.id("password"));

    private WebElementFacade logOn = $(By.xpath("//button[contains(@type, 'submit')]"));

    public void enterUserName() {
        username.waitUntilEnabled().type("Admin");
    }

    public void enterPassword() {
        password.waitUntilEnabled().type("domin123");
    }

    public void clickLogin() {
        logOn.waitUntilClickable().click();
    }

}
