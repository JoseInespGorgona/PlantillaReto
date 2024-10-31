package com.choucairtesting.tasks;

import com.choucairtesting.interactions.RegistrarInformacionInteraction;
import com.choucairtesting.utils.LeerDatosExcel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.IOException;

public class InicioSesionTask implements Task {
    LeerDatosExcel excel;

    public InicioSesionTask() throws IOException {
        excel = new LeerDatosExcel();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    RegistrarInformacionInteraction.registrar()
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static InicioSesionTask inisioSesionTask() {
        return Instrumented.instanceOf(InicioSesionTask.class).withProperties();
    }
}
