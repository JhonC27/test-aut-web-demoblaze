package com.chubb.latam.iq.test.automation.web.userinterfaces.general.pantalla;

import net.serenitybdd.screenplay.targets.Target;

public class PantallaUI {
    public static Target LBL_TEXTO_ES = Target.the("texto")
        .locatedBy("//*[@id=\"nameofuser\"]");

//    public static Target LBL_TEXTO_CONTIENE = Target.the("texto en pantalla contiene: {0}")
//        .locatedBy("//*[@id=\"nameofuser\"]");
}
//"texto en pantalla es: {0}"
