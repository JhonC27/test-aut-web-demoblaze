package com.chubb.latam.iq.test.automation.web.tasks.features.acceso;

import com.chubb.latam.iq.test.automation.web.userinterfaces.features.acceso.AccesoUI;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

@AllArgsConstructor
public class Acceder implements Task{

    private String usuario;
    private String clave;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            Enter.theValue(this.usuario)
                .into(AccesoUI.TXT_USERNAME),
             Enter.theValue(this.clave)
              .into(AccesoUI.TXT_PASSWORD),

           Click.on(AccesoUI.BTN_LOGIN_REGISTRO)
        );
    }

    public static Acceder aIQ(String usuario, String clave)
    {
       return Tasks.instrumented(
            Acceder.class,
            usuario,
            clave
       );
    }
}
