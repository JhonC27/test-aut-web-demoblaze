package com.demoblaze.test.automation.web.interactions.ventana;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

@AllArgsConstructor
public class Navegar implements Interaction
{
    private String url;

    @Managed
    static WebDriver suNavegador;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.whoCan(BrowseTheWeb.with(suNavegador))
        .attemptsTo(
            Open.url(this.url)
        );
    }

    public static Navegar hacia(String url)
    {
       return Tasks.instrumented(
               Navegar.class,
               url
       );
    }
}
