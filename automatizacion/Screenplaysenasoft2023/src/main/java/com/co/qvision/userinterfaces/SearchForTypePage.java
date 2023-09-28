package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchForTypePage {

    //----------------------------------------------------------------Aqui se aplican los filtros de busqueda en caso de ser nesesario----------------------------------------------------------------------------------
    public static final Target SLT_TYPE=Target.the("Boton para escojer el  tipo de alojamiento").locatedBy("//button[@data-testid='sorters-dropdown-trigger']");
    public static final Target OPT_TYPE=Target.the("Opcion de tipo de alojamiento").locatedBy("//span[contains(text(), 'Precio (más bajo primero)')]");
    public static final Target SLT_OPTION_HOTEL=Target.the("Seleccionar el hotel").locatedBy("(//div[@data-testid='property-card'])[1]");
    public static final Target A_SEE_HOTEL=Target.the("ver informacion del hotel").locatedBy("(//a[@data-testid='availability-cta-btn'])[1]");
    public static final Target BTN_RESERVE=Target.the("Reservar hotel").locatedBy("//button[@id='hp_book_now_button']");


}
