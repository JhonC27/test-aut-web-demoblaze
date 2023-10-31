package com.demoblaze.test.automation.web.userinterfaces.features.portal;

import net.serenitybdd.screenplay.targets.Target;

public class PortalUI {
   

    public static Target BTN_ACCEDER = Target.the("acceder")
        .locatedBy("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape");

   }
