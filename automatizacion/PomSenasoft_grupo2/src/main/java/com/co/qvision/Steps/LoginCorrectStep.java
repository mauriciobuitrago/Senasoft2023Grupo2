package com.co.qvision.Steps;


import com.co.qvision.PageObejcts.LoginPage;
import net.thucydides.core.annotations.Step;
import com.co.qvision.models.CredentialLoginCorrectly;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class LoginCorrectStep {



    LoginPage loginPage;
    @Step
    public void openBrowser(){
        loginPage.open();
    }
    @Step
    public void close(){
        loginPage.getDriver().findElement(loginPage.getBTN_())
                .click();
    }

    @Step
    public void login(){

        loginPage.getDriver().findElement(loginPage.getBTN_LOGIN())
                .click();
    }
    @Step
    public void email(String email){
        loginPage.getDriver().findElement(loginPage.getTXT_EMAIL()).sendKeys(email);
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);
        }

    }
    @Step
    public void continued() {
        loginPage.getDriver().findElement(loginPage.getBTN_CONTINUED())
                .click();
    }
    @Step
    public void password(String password  ) {
        loginPage.getDriver().findElement(loginPage.getTXT_PASSWORD()).sendKeys(password);
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);
        }

    }
    @Step
    public void ingres() {
        loginPage.getDriver().findElement(loginPage.getBTN_LG())
                .click();
    }
    @Step
    public void verify() {
        Assert.assertThat(loginPage.getDriver().findElement(loginPage.getBTN_CONTINUED()).isDisplayed(),
                Matchers.is(true));
    }




}


