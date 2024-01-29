package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.ui.cinemarkUi;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class testDataTable implements Task {
    private final String Nombres;
    private final String Apellidos;
    private final String correoElectronico;
    private final String confirmarCorreo;
    private final String Celular;
    private final String Direccion;
    private final String NumDocumento;
    private final String Contrasena;

    public testDataTable(String NAME, String LASTNAME, String EMAIL, String EMAIL_CONFIRMATION, String PHONE, String ADDRESS, String DOCUMENT_NUMBER, String PASSWORD) {
        this.Nombres = NAME;
        this.Apellidos = LASTNAME;
        this.correoElectronico = EMAIL;
        this.confirmarCorreo = EMAIL_CONFIRMATION;
        this.Celular = PHONE;
        this.Direccion = ADDRESS;
        this.NumDocumento = DOCUMENT_NUMBER;
        this.Contrasena = PASSWORD;
    }

    public static Performable dataDate(String Nombres, String Apellidos, String correoElectronico, String confirmarCorreo, String Celular, String Dirección, String NumDocumento, String Contrasena ) {
        return instrumented(testDataTable.class, Nombres, Apellidos, correoElectronico, confirmarCorreo, Celular, Dirección, NumDocumento, Contrasena);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(cinemarkUi.ACCESS_USER),

                WaitUntil.the(cinemarkUi.BUTTON_REGISTER, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(cinemarkUi.BUTTON_REGISTER),

                WaitUntil.the(cinemarkUi.NAME_REGISTER, isVisible()).forNoMoreThan(50).seconds(),


                Click.on(cinemarkUi.NAME_REGISTER),
                SendKeys.of(Nombres).into(cinemarkUi.NAME_REGISTER),

                Click.on(cinemarkUi.LASTNAME_REGISTER),
                SendKeys.of(Apellidos).into(cinemarkUi.LASTNAME_REGISTER),

                Click.on(cinemarkUi.EMAIL_REGISTER),
                SendKeys.of(correoElectronico).into(cinemarkUi.EMAIL_REGISTER),

                Click.on(cinemarkUi.EMAIL_CONFIRMATION_REGISTER),
                SendKeys.of(confirmarCorreo).into(cinemarkUi.EMAIL_CONFIRMATION_REGISTER),

                Click.on(cinemarkUi.PHONE_REGISTER),
                SendKeys.of(Celular).into(cinemarkUi.PHONE_REGISTER),

                Click.on(cinemarkUi.ADDRESS_REGISTER),
                SendKeys.of(Direccion).into(cinemarkUi.ADDRESS_REGISTER),

                //Clic para cerrar el teclado
                Click.on(cinemarkUi.LIST_GENERAL),

                Click.on(cinemarkUi.THEATER_REGISTER),
                Click.on(cinemarkUi.THEATER_OPTION_ONE),

                Click.on(cinemarkUi.CLIC_DOCUMENT_NUMBER_REGISTER),
                SendKeys.of(NumDocumento).into(cinemarkUi.EDIT_DOCUMENT_NUMBER_REGISTER),

                Click.on(cinemarkUi.CLIC_PASSWORD_REGISTER),
                SendKeys.of(Contrasena).into(cinemarkUi.EDIT_PASSWORD_REGISTER),

                //Aceptar terminos y condiciones
                Click.on(cinemarkUi.TERMS_AND_CONDITIONS),

                //Botón continuar
                Click.on(cinemarkUi.BUTTON_CONTINUE),

                //Clic en el calendario
                Click.on(cinemarkUi.CLIC_CALENDAR),
                Click.on(cinemarkUi.EDIT_CALENDAR),
                Click.on(cinemarkUi.EDIT_DATE_CALENDAR),
                //Borrar la fecha por default
                Clear.field(cinemarkUi.EDIT_DATE_CALENDAR),
                SendKeys.of("10/01/1990").into(cinemarkUi.EDIT_DATE_CALENDAR),
                Click.on(cinemarkUi.BUTTON_CALENDAR),

                //Botón continuar
                Click.on(cinemarkUi.BUTTON_CONTINUE)

        );
    }
}
