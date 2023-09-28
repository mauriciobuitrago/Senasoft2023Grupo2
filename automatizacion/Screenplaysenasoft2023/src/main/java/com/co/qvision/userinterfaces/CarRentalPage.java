package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarRentalPage {
    public static final Target BTN = Target.the("CLICK EN EL BOTON")
            .locatedBy("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");
    public static final Target BTN_CAR_RENTAL = Target.the("CLICK EN EL BOTON alquilar coches")
            .locatedBy("//a[@id='cars']");
    public static final Target BTN_CITY = Target.the("da click")
            .locatedBy("//label[@class='LPCM_cdcb464a LPCM_fe9da244 sbc-fl-text-input__label']");
    public static final Target TXT_CITY = Target.the("da click")
            .locatedBy(" //input[@id='searchbox-toolbox-fts-pickup']");
    public static final Target TXT_CITY2 = Target.the("da click")
            .locatedBy("//span[@data-testid='badge']");

    public static final Target BTN_DATE = Target.the("CLICK PARA ESCOGER FECHA")
            .locatedBy("//button[@id='searchbox-toolbox-date-picker-pickup-date']");
    public static final Target BTN_DAY= Target.the("CLICK PARA ESOCGER EL DIA")
            .locatedBy("//span[@data-date='2023-09-27']");
    public static final Target BTN_DAY2= Target.the("CLICK PARA ESOCGER EL DIA de regreso")
            .locatedBy("//span[@data-date='2023-10-23']");
    public static final Target BTN_HOUR= Target.the("CLICK PARA ESOCGER HORA")
            .locatedBy("//select[@name='dropoff-time']");
    public static final Target BTN_HOUR2= Target.the("CLICK PARA ESOCGER HORA DE REGRESOo")
            .locatedBy("//option[@value='17:00']");

    public static final Target BTN_SEARCH= Target.the("CLICK BOTON BUSCAR")
            .locatedBy("//button[@data-testid='searchbox-toolbox-submit-button']");


}
