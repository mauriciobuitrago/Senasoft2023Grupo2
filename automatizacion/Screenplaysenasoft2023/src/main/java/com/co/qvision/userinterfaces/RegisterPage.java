package com.co.qvision.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target  BTN = Target.the("CLICK EN EL BOTON")
            .locatedBy("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");

    public static final Target  BTN_REGISTER = Target.the("CLICK EN EL BOTON")
            .locatedBy("//a[@data-testid='header-sign-up-button']");
    public static final Target TXT_EMAIL= Target.the("campo para ingresar email")
            .locatedBy("//input[@id='username']");
    public static final Target BTN_CONTINUED= Target.the("click en continuar por correo")
            .locatedBy("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]");
    public static final Target TXT_PASSWORD= Target.the("campo para ingresar password")
            .locatedBy("//input[@id='new_password']");
    public static final Target TXT_CONFIRMED_PAASWORD= Target.the("campo para ingresar confirmacion de contrasena")
            .locatedBy(" //input[@id='confirmed_password']");
    public static final Target BTN_CREATE= Target.the("campo para ingresar confirmacion de contrasena")
            .locatedBy("//span[contains(text(),'Crear una cuenta')]");




}
