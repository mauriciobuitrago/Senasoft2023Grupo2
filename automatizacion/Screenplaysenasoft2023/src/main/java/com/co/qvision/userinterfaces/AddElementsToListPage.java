package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddElementsToListPage {
    //---------------------------------------------------------------------------Estos localizadores se utilizaran para que se puedan agregar nuevos Elementos a la lista de guardar-------------------------------------------------------------------------------------------------------------------------
    public static final Target ADD_SAVE_LIST_1=Target.the("Agregar a la lista de guardados").locatedBy("(//button[@data-testid='wishlist-button'])[1]");
    public static final  Target ADD_SAVE_LIST_2=Target.the("Agregar a la lista de guardados").locatedBy("(//button[@data-testid='wishlist-button'])[2]");
    public static final Target SLT_FILTER_3=Target.the("Seleeccioner un filtro").locatedBy("(//div//div[@data-testid='filters-group']//input[@type='checkbox'])[6]");
    public static final Target A_PERFIL=Target.the("Ir al modulo de perfil").locatedBy("//button[@data-testid='header-profile']");
    public static final Target A_SAVED_PERFIL=Target.the("Ir al modulo de guardaods").locatedBy("//body/div[@id=':rc:']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]");
    public static final Target VRF_DIV_ELEMENTS=Target.the("Verificar elementos guardados").locatedBy("//ul[@class='bui-carousel__inner']");
    public static final Target TXT_CORREO=Target.the("Validar correo").locatedBy("");
    public static final Target TXT_PASS=Target.the("Validar contraseña").locatedBy("");

}
