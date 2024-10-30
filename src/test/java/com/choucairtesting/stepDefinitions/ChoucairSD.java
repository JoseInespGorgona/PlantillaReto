package com.choucairtesting.stepDefinitions;

import com.choucairtesting.interactions.AbrirNavegador;
import com.choucairtesting.questions.Validacion;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class ChoucairSD {

    @Before
    public void configuracion() {
        setTheStage(new OnlineCast());
    }

    @Dado("que se habre el navegador donde se realizara prueba")
    public void queSeHabreElNavegadorDondeSeRealizaraPrueba() {
        OnStage.theActorCalled("Gorgona")
                .attemptsTo(
                        AbrirNavegador.cargarNavegador()
                );
    }

    @Entonces("se visualiza el el navegador")
    public void seVisualizaElElNavegador() {
        OnStage.theActorCalled("Gorgona")
                .should(seeThat(Validacion.validacion()));
    }
}
