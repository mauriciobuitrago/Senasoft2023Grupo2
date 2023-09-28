package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterIncorrectlyPage {
    public static final Target BTN_REGISTER = Target.the("CLICK EN EL BOTON")
            .locatedBy("//a[@data-testid='header-sign-up-button']");
    public static final Target TXT_EMAIL= Target.the("campo para ingresar email")
            .locatedBy("//input[@id='username']");
    public static final Target BTN_CONTINUED= Target.the("click en continuar por correo")
            .locatedBy("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]");
    public static final Target BTN_CREATE= Target.the("campo para ingresar confirmacion de contrasena")
            .locatedBy("//span[contains(text(),'Crear una cuenta')]");
}
