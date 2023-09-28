package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CustumerPage {
    public static final Target A_COMMENT=Target.the("Ir al amodulo para dejar la peticion").locatedBy("//a[@id='flights']");
        public static final Target BTN_CUSTUME=Target.the("Boton de califiacion").locatedBy("//div[@class='css-q8bhps']//button[@type='button']");
        public static final Target CONTENEDOR_VLT=Target.the("Validar contenedor").locatedBy("//div[@class='SheetContainer-module__content___dCG7f']");

}
