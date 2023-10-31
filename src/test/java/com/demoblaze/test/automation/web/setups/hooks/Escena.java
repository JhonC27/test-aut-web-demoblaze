package com.demoblaze.test.automation.web.setups.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Escena {
    
    @Before
    public void camaras() {
        OnStage.setTheStage(new OnlineCast());
    }
    
}
