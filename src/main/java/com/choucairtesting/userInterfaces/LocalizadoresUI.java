package com.choucairtesting.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.io.IOException;

public class LocalizadoresUI {

    public static final Target IMG_LOGOCHOUCAIR =
            Target.the("Logo Choucair").
                    locatedBy("//img[@class='site-logo']");

    public static final Target BTN_PRIMARIA_PREPAGO =
            Target.the("Boton primaria prepago").
                    locatedBy("//*[contains(text(), 'Primaria Prepagada')]");

    public static final Target BTN_OFERTA =
            Target.the("Boton de suscribir oferta ").
                    locatedBy("(//div[@x-autoid='productaddtocar '])[1]");

    public static final Target BTN_TIPO_DOCUMENTO =
            Target.the("Boton seleccionar tipo de documento ").
                    located(By.id("ocTriggeridTypeInputudrop00004"));

    public static final Target LST_CEDULA_CIUDADANIA =
            Target.the("Cedula de ciudadania").
                    located(By.id("agentdesktopudrop00004CC"));

    public static final Target TXT_NUMERO_DOCUMENTO =
            Target.the("Numero de documento").
                    located(By.name("$Gadget_00I.input.idNumber"));

    public static final Target BTN_CALENDARIO =
            Target.the("Boton calendario").
                    locatedBy("(//div[@class='oc-date ng-scope']/span[@title='...'])[1]");

    public static final Target LST_MES =
            Target.the("Seleccione el mes").
                    locatedBy("//select[@class='datetimepicker_newMonth']");

    public static final Target LST_ANO =
            Target.the("Seleccionar año").
                    locatedBy("//*[@id=\"datetimepicker_div\"]/div[1]/div[2]/div/select[2]");

    public static final Target BTN_DIA =
            Target.the("Seleccionar dia").
                    locatedBy("//td[@class='datetimepicker_daysCell ']/a[@value='{0}']");

    public static final Target BTN_CONSULTAR_USUARIO =
            Target.the("Boton validar usuario").
                    locatedBy("//div[@class='btn_normal_green btn_nomargin']");

    public static final Target BTN_CERO_PAPEL =
            Target.the("Boton cero papel").
                    locatedBy("//span[.='Validar Cero Papel']");

    public static final Target BTN_COMPROBACION_CERO_PAPEL =
            Target.the("Comprobacion validacion cero papel").
                    locatedBy("//span[.='Compruebe el resultado']");

    public static final Target BTN_OK_VALIDACION =
            Target.the("Ok de la validacion").
                    locatedBy("//div[@class='msgbox-ok-text']");

    public static final Target RDO_EQUIPO_TRAIDO =
            Target.the("Equipo traido").
                    locatedBy("(//span[@class='radio ng-scope']/ins[@class='uIcon'])[1]");

    public static final Target BTN_PCO =
            Target.the("Boton PCO").
                    locatedBy("//span[contains(text(),'Validar PCO')]");

    public static final Target BTN_MODIFICAR_ATRIBUTOS_OFERTA =
            Target.the("Modificicacion atributos de la oferta").
                    locatedBy("//span[contains(text(),'Modificar los atributos de oferta primaria')]");

    public static final Target TXT_SELECCIONAR_OFERTA_SUPLEMENTARIA =
            Target.the("Texto de seleccionar oferta suplementaria").
                    locatedBy("//span[contains(text(),'Seleccione Oferta Suplementaria')]");

    public static final Target TXT_ =
            Target.the("").
                    locatedBy("");



    public LocalizadoresUI() throws IOException {
    }
}
