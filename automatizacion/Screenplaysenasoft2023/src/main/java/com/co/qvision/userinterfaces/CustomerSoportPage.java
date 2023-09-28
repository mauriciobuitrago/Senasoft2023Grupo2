package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CustomerSoportPage {
    public static final Target A_HELP=Target.the("BOTON PARA IR AL MODULO DE SERVISIO AL CLIENTE").locatedBy("//a[@class='cuca']");
    public static final Target NAV_OPTIONS=Target.the("Ir al menu de opciones").locatedBy("//div[@class='b4db3523c5 a861df9be1']");
    public static final Target SLT_ITEM=Target.the("Seleccionar el tipo de servicio").locatedBy("(//button[@role='tab'])[3]");
    public static final Target SLT_PROBLEM=Target.the("Seleccionar el tipo de problema").locatedBy("(//div[@class='c288a4e55d'])[2]");
    public static final Target VRF_INFO=Target.the("Verificar que el usuario esta viendo la unformacion").locatedBy("(//div[@class='af2738844d'])[1]");


}
