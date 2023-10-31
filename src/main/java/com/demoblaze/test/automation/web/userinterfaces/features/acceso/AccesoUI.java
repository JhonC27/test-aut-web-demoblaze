package com.demoblaze.test.automation.web.userinterfaces.features.acceso;

import net.serenitybdd.screenplay.targets.Target;

public class AccesoUI {

    public static Target BTN_LOGIN = Target.the("acceder")
        .locatedBy("//*[@id=\"login2\"]");

    public static Target TXT_USERNAME = Target.the("usuario")
        .locatedBy("//*[@id=\"loginusername\"]");

    public static Target TXT_PASSWORD = Target.the("password")
        .locatedBy("//*[@id=\"loginpassword\"]");

    public static Target BTN_LOGIN_REGISTRO = Target.the("login_registro")
        .locatedBy("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
}


//*[@id="passwordNext"]/div/button
//*[@id="identifierNext"]/div/button
//*[@id="passwordNext"]/div/button

//input[@type='password']
//*[@id="password"]
//*[@id="password"]/div[1]/div/div[1]/input
