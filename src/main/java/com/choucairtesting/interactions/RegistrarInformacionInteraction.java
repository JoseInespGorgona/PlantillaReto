package com.choucairtesting.interactions;

import com.choucairtesting.utils.LeerDatosExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.choucairtesting.userInterfaces.LocalizadoresUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RegistrarInformacionInteraction implements Interaction {

    LeerDatosExcel leerDatosExcel;

    public RegistrarInformacionInteraction() throws IOException {
        leerDatosExcel = new LeerDatosExcel();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        //WaitUntil.the(TXT_USUARIO, isClickable()).forNoMoreThan(30).seconds(),
        //String usuario = leerDatosExcel.leerDatos("Sesion", 1, 0);
        //String clave = leerDatosExcel.leerDatos("Sesion", 1, 1);
        actor.attemptsTo(

        );
    }

    public static RegistrarInformacionInteraction registrar() throws IOException {
        return new RegistrarInformacionInteraction();
    }
}
