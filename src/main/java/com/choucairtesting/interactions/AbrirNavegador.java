package com.choucairtesting.interactions;

import com.choucairtesting.utils.LeerDatosExcel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import java.io.IOException;

public class AbrirNavegador implements Interaction {
    LeerDatosExcel excel;

    public AbrirNavegador() throws IOException {
        excel = new LeerDatosExcel();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(excel.leerDatos("Dominio", 1, 0))
        );
    }

    public static AbrirNavegador cargarNavegador() {
        return Instrumented.instanceOf(AbrirNavegador.class).withProperties();
    }
}


