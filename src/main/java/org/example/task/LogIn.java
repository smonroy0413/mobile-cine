package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.ui.cinemarkUi;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogIn implements Task {

    private final String usuario;
    private final String contraseña;

    public LogIn(String USER, String PASSWORD) {
        this.usuario = USER;
        this.contraseña = PASSWORD;
    }

    public static Performable dataDate(String usuario, String contraseña) {
            return instrumented(testDataTable.class, usuario, contraseña);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(cinemarkUi.ACCESS_USER),
                WaitUntil.the(cinemarkUi.EMAIL_LOGIN, isVisible()).forNoMoreThan(30).seconds(),

                Click.on(cinemarkUi.EMAIL_LOGIN),
                SendKeys.of(usuario).into(cinemarkUi.CLIC_PASSWORD_REGISTER),
                Click.on(cinemarkUi.PASSWORD_LOGIN),
                SendKeys.of(contraseña).into(cinemarkUi.EDIT_PASSWORD_REGISTER),
                Click.on(cinemarkUi.BUTTON_LOGIN)
        );
    }
}
