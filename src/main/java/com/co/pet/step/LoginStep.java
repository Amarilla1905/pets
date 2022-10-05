package com.co.pet.step;

import com.co.pet.pagesobjects.LoginPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class LoginStep {

    LoginPage loginHomePage = new LoginPage();

    @Step

    public void openBrowser(){
        loginHomePage.open();
    }

    @Step

    public void selectSignIn(){
        loginHomePage.getDriver().findElement(loginHomePage.getBTN_SIGN()).click();
    }

    @Step

    public void addUser(){

        loginHomePage.getDriver().findElement(loginHomePage.getTXT_USERNAME()).sendKeys("scastano");


    }

    @Step

    public void addPassword(){
        loginHomePage.getDriver().findElement(loginHomePage.getTXT_PASSWORD()).clear();
        loginHomePage.getDriver().findElement(loginHomePage.getTXT_PASSWORD()).sendKeys("j2ee");
    }

    @Step

    public void clickLogin(){

        loginHomePage.getDriver().findElement(loginHomePage.getBTN_LOGIN()).click();
    }

    @Step
    public void validateMessageLogin(){
        Assert.assertThat(loginHomePage.getDriver().findElement(loginHomePage.getLBL_WELCOME())
                .isDisplayed(), Matchers.is(true));
    }


}
