package com.chubb.latam.iq.test.automation.web.questions.general.pantalla;

import com.chubb.latam.iq.test.automation.web.userinterfaces.general.pantalla.PantallaUI;

import lombok.Builder;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;



@Builder
public class SeObservaTexto implements Question<Boolean>{
    
    private String texto;

    @Override
    public Boolean answeredBy(Actor actor)
    {
        WebElementFacade elemento = PantallaUI.LBL_TEXTO_ES.of(this.texto).resolveFor(actor);

        System.out.println (elemento.getText());

        System.out.println (PantallaUI.LBL_TEXTO_ES.of(this.texto)
                .resolveFor(actor).getText());

        System.out.println("el texto es:" + texto);

        return elemento.isVisible();

        //return PantallaUI.LBL_TEXTO_ES.of(this.texto)
            //.resolveFor(actor).isVisible();
        //System.out.printf("el texto es:",texto);
    }


    public static SeObservaTexto enPantalla(String texto)
    {
        return SeObservaTexto.builder()
            .texto(texto)
            .build();
    }
}
