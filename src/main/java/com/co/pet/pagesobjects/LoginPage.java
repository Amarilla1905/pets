package com.co.pet.pagesobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://petstore.octoperf.com/actions/Catalog.action")
public class LoginPage extends PageObject {

    //Locators of the objects
    By BTN_SIGN = By.xpath("//a[normalize-space()='Sign In']");
    By TXT_USERNAME = By.cssSelector("p input[type='text']");
    By TXT_PASSWORD = By.xpath("//input[@name='password']");
    By BTN_LOGIN = By.cssSelector("input[value='Login']");
    By LBL_WELCOME = By.xpath("//div[contains(@id,'WelcomeContent')]");


    public By getBTN_SIGN() {
        return BTN_SIGN;
    }

    public By getTXT_USERNAME() {
        return TXT_USERNAME;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public By getLBL_WELCOME() {
        return LBL_WELCOME;
    }
}
