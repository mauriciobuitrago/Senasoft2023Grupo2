package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OpenLoginPage {
    public static Target BTN_LOGIN =Target.the("Boton para login").locatedBy("//a[@data-testid='header-sign-in-button']");
    public static Target TXT_EMAIL_ =Target.the("Escribir email").locatedBy("//input[@type='email']");
    public static Target BTN_CONTINUAR =Target.the("Boton para continuar").locatedBy("//button[@type='submit']");

    public static Target TXT_PASS =Target.the("Escribir contraseña").locatedBy("//input[@type='password']");

    public static Target BTN_ENTER =Target.the("Boton para login").locatedBy("//button[@type='submit']");
    public static Target VLT_BUTTON =Target.the("Texto para validar").locatedBy("//*[text()='¿Eres un robot?']");



}
