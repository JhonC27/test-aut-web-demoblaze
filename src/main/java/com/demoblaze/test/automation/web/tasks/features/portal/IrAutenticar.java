package com.demoblaze.test.automation.web.tasks.features.portal;

import com.demoblaze.test.automation.web.userinterfaces.features.acceso.AccesoUI;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

@AllArgsConstructor
public class IrAutenticar implements Task{

    @Override
    public <T extends Actor> void performAs(T actor)
    {
           actor.attemptsTo(
                Click.on(AccesoUI.BTN_LOGIN)
        );
    }

    public static IrAutenticar laCuenta()
    {
       return Tasks.instrumented(
            IrAutenticar.class
       );
    }
}
