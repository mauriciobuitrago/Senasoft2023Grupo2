package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FligtPage {
    public static final Target BTN = Target.the("CLICK EN EL BOTON")
            .locatedBy("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");
    public static final Target BTN_FLIGHT= Target.the("CLICK EN EL VUELOS")
            .locatedBy("//a[@id='flights']");
    public static final Target BTN_IMAGE= Target.the("CLICK EN UNA IMAGEN")
            .locatedBy("(//img[@class='Image-module__image___hShGQ Image-module__image--content-mode-fill___x6Ff3'])[3]");
    public static final Target BTN_SEEFLIGHT= Target.the("CLICK EN VER VUELOS")
            .locatedBy("//button[@data-testid='flight_card_bound_select_flight']");
    public static final Target BTN_NETX= Target.the("CLICK EN SIGUIENTE")
            .locatedBy("(//button[@type='button'])[46]");
    public static final Target BTN_NETXCONTINUED= Target.the("CLICK EN CONTINUAR")
            .locatedBy("(//button[@type='button'])[10]");
    public static final Target BTN_NETXCONTINUED1= Target.the("CLICK EN CONTINUAR")
            .locatedBy(" //div[@data-testid='passenger_title']");
    public static final Target TXT_NAMEA= Target.the("CAMPO PARA NOMBRE DE QUIEN RESERVA")
            .locatedBy("//input[@name='passengers.0.firstName']");
    public static final Target TXT_LASTNAME= Target.the("CAMPO PARA NOMBRE DE QUIEN RESERVA")
            .locatedBy("//input[@name='passengers.0.lastName']");
    public static final Target BTN_LIST= Target.the("CAMPO PARA NOMBRE DE QUIEN RESERVA")
            .locatedBy("(//button[@type='button'])[6]");

    public static final Target TXT_EMAILC= Target.the("CAMPO PARA EMAIL")
            .locatedBy("//input[@name='booker.email']");
    public static final Target TXT_TEL= Target.the("CAMPO PAT¿RA TEL")
            .locatedBy("//input[@type='tel']");
    public static final Target TXXT_NAME= Target.the("CAMPO PARA NOMBRE")
            .locatedBy("//input[@name='passengers.0.firstName']");
    public static final Target TXXT_LASTNAME= Target.the("CAMPO PARA APELLIDO")
            .locatedBy("///input[@name='passengers.0.lastName']");
    public static final Target BTN_GENDER= Target.the("CLICK PARA SELECIIONAR GENERO")
            .locatedBy("//select[@name='passengers.0.gender']");
    public static final Target BTN_SELECTGENDER= Target.the("CLICK EN EL MUJER")
            .locatedBy("//option[@value='female']");
    public static final Target TXT_DAY= Target.the("CAMPO PARA DIA ")
            .locatedBy("//input[@data-testid='traveller_data_field_passenger_0_dd']");
    public static final Target BTN_SELECT_MONTH= Target.the("CLICK EN EL MES")
            .locatedBy("//select[@data-testid='traveller_data_field_passenger_0_mm']");
    public static final Target BTN_MONTH= Target.the("Campo paraselecionar mes")
            .locatedBy("//option[@value='11']");
    public static final Target TXT_YEARS= Target.the("CAMPO PARAR ESCRIBIR AÑO")
            .locatedBy("(//input[@name='passengers.0.birthDate'])[3]");
    public static final Target BTN_NEEXT= Target.the("CLICK EN siguiente")
            .locatedBy("(//button[@class='Actionable-module__root___o3y3+ Button-module__root___2Z2KR Button-module__root--variant-primary___y2Plz Button-module__root--size-large___pnD+H Button-module__root--wide-true___WObU1 Button-module__root--variant-primary-action___3ZdxJ']");
    public static final Target BTN_NEEXT2= Target.the("CLICK EN siguiente")
            .locatedBy("(//button[@type='button'])[3]");

    public static final Target TXT_NAMETARGET= Target.the("ESCRIBE NOMBRE TARJETA")
            .locatedBy("//input[@name='name']");
    public static final Target TXT_NUMBER_TARGET= Target.the("ESCRIBE NUMERO TARJETA")
            .locatedBy("//input[@name='number']");
    public static final Target TXT_EXPIREDTARGET= Target.the("ESCRIBE NOMBRE TARJETA")
            .locatedBy("(//input[@name='expirationDate'])[1]");
    public static final Target TXT_CVC= Target.the("ESCRIBE CVC DE LA TARJETA")
            .locatedBy("(//input[@name='cvc']");
    public static final Target BTN_SELECT= Target.the("SELELCIONA")
            .locatedBy("//span[@class='Icon-module__root___tiYlo InputCheckbox-module__checkbox-icon___p05g+ Icon-module__root--size-small___UwcQH']");
    public static final Target BTN_RESERVATION= Target.the("VALIDACION DE EXITO")
            .locatedBy("(//button[@type='button'])[7]");


    public static final Target VALIDATION= Target.the("VALIDACION DE EXITO")
            .locatedBy("//div[text()='No completada']");


}
