package com.choucairtesting.tasks;

import com.choucairtesting.utils.LeerDatosExcel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

public class InicioSesionTask implements Task {
    LeerDatosExcel excel;

    public InicioSesionTask() throws IOException {
        excel = new LeerDatosExcel();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String usuario, clave;
        usuario = excel.leerDatos("Credenciales",  1,0);
        clave = excel.leerDatos("Credenciales",  1,1);

        actor.attemptsTo(
                Enter.theValue(usuario).into(),
                Enter.theValue(clave).into(),
                Click.on(/*InicioSesionUI.BTN_INICIAR_SESION*/)


        );
    }

    public static InicioSesionTask inisioSesionTask() {
        return Instrumented.instanceOf(InicioSesionTask.class).withProperties();

    }
}
