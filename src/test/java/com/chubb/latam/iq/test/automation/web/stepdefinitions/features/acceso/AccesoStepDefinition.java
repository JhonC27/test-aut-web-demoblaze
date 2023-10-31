package com.chubb.latam.iq.test.automation.web.stepdefinitions.features.acceso;

import com.chubb.latam.iq.test.automation.web.questions.general.pantalla.SeObservaTexto;
import com.chubb.latam.iq.test.automation.web.tasks.features.acceso.Acceder;
import com.chubb.latam.iq.test.automation.web.tasks.features.portal.IrAutenticar;
import com.chubb.latam.iq.test.automation.web.tasks.general.portal.EntrarAlPortal;

import com.chubb.latam.iq.test.automation.web.userinterfaces.features.portal.PortalUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

public class AccesoStepDefinition {


    @Dado("^que el \"(.*)\" se encuentra en la pagina.*")
    public static void dadoQueSeEncuentraEnLaPagina(String actor)
    {
        OnStage.theActorCalled(actor)
            .attemptsTo(
                EntrarAlPortal.web(),
                IrAutenticar.laCuenta()
                );
    }

    @Cuando("^intenta acceder con credenciales (.*), (.*)")
    public static void cuandoIntentaAccederConCredenciales(String usuario, String clave)
    {
        OnStage.theActorInTheSpotlight()
            .attemptsTo(
                Acceder.aIQ(usuario,clave)
            );
    }

    @Entonces("^debería mostrarse en la web: \"(.*)\"")
    //public void entoncesDeberiaMostrarseEnLaWeb(String elTexto)
    public void entoncesDeberiaMostrarseEnLaWeb(String texto)
    {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        //SeObservaTexto.enPantalla(elTexto)
                        SeObservaTexto.enPantalla(texto)
                )
        );
    }
}
