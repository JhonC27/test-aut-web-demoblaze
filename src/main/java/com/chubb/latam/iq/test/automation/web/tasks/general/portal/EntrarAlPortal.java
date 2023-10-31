package com.chubb.latam.iq.test.automation.web.tasks.general.portal;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import com.chubb.latam.iq.test.automation.web.constants.enums.SerenityConf;
import com.chubb.latam.iq.test.automation.web.interactions.ventana.Navegar;

@AllArgsConstructor
public class EntrarAlPortal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            Navegar.hacia(SerenityConf.URL_BASE.getValor())
        );
    }

    public static EntrarAlPortal web()
    {
       return Tasks.instrumented(
               EntrarAlPortal.class
       );
    }
}
