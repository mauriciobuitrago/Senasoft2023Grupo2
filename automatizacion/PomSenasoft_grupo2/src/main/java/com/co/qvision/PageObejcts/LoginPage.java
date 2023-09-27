package com.co.qvision.PageObejcts;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
// con@DefaultUrl importamos la url que nos pemitira llevar a la pagina web que vamos automatizar
@DefaultUrl("https://www.booking.com/index.es.html?label=es-co-booking-desktop-QLGRvVsXz2aps*_lUmd*1gS652804041077%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-102518000%3Alp1003665%3Ali%3Adec%3Adm&gclid=CjwKCAjwgsqoBhBNEiwAwe5w077TiV0TUdUzYfYh1-6VJKeaKbN97OQud8lSIPgn5wWrkdyjhOGSYRoCtLEQAvD_BwE&aid=2336990&sid=91faa5accfec39eacfbf6ac0adf3e1d7")
public class LoginPage extends PageObject {

    //generamos localizadores
    By BTN_ = By.xpath("//button[@aria-label='Ignorar información sobre el inicio de sesión.']");
    By BTN_LOGIN =By.xpath("(//span[@class='e4adce92df'])[5]");

    //a[@data-testid='header-sign-in-button']
    By TXT_EMAIL = By.xpath("//input[@name='username']");
    By BTN_CONTINUED = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]");

    By TXT_PASSWORD = By.xpath("//input[@name='password']");
    By BTN_LG = By.xpath("//button[@type='submit']");





//input[@name="password"]
    //generamos meotodos getter and setter para poder obtener datos e instaciarlos en los steps


    public By getBTN_LG() {
        return BTN_LG;
    }

    public void setBTN_LG(By BTN_LG) {
        this.BTN_LG = BTN_LG;
    }

    public By getBTN_() {
        return BTN_;
    }

    public void setBTN_(By BTN_) {
        this.BTN_ = BTN_;
    }

    public By getTXT_EMAIL() {
        return TXT_EMAIL;
    }

    public void setTXT_EMAIL(By TXT_EMAIL) {
        this.TXT_EMAIL = TXT_EMAIL;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public void setBTN_LOGIN(By BTN_LOGIN) {
        this.BTN_LOGIN = BTN_LOGIN;

    }

    public By getBTN_CONTINUED() {;
        return BTN_CONTINUED;
    }

    public void setBTN_CONTINUED(By BTN_CONTINUED) {
        this.BTN_CONTINUED = BTN_CONTINUED;
    }
}
