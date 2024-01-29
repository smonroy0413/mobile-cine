package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.ui.cinemarkUi;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class start implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(cinemarkUi.ALLOW_NOTIFICATIONS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(cinemarkUi.ALLOW_NOTIFICATIONS),
                WaitUntil.the(cinemarkUi.ALLOW_LOCATION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(cinemarkUi.ALLOW_LOCATION),
                WaitUntil.the(cinemarkUi.ACCESS_LOCATION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(cinemarkUi.ACCESS_LOCATION),
                WaitUntil.the(cinemarkUi.ACCESS_USER, isVisible()).forNoMoreThan(60).seconds()
                //Click.on(cinemarkUi.ACCESS_USER)
        );
    }
}
