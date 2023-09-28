package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccommodationForFiltres {
    //--------------------------------------------------------------------------------------------------------------------------------------------------
    public static final Target DIV_FILTRES_PRICE=Target.the("Cuadro de filtros recientes").locatedBy("(//div[@data-filters-group='price'])[1]");
    public static final Target DIV_FILTRES_POPULAR=Target.the("Cuadro de filtros recientes").locatedBy("//div[@data-filters-group='popular']");
    public static final Target SLT_FILTER_1=Target.the("Seleeccioner un filtro").locatedBy("(//div//div[@data-testid='filters-group']//input[@type='checkbox'])[1]");
    public static final Target SLT_FILTER_2=Target.the("Seleeccioner un filtro").locatedBy("(//div//div[@data-testid='filters-group']//input[@type='checkbox'])[5]");
    public static final Target SLT_FILTER_3=Target.the("Seleeccioner un filtro").locatedBy("(//div//div[@data-testid='filters-group']//input[@type='checkbox'])[6]");

    public static final Target SEE_PRODUCT=Target.the("Ver producto").locatedBy("(//img[@data-testid='image'])[1]");

}
