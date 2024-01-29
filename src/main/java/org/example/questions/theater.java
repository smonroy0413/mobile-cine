package org.example.questions;

import net.serenitybdd.screenplay.Question;
import org.example.ui.cinemarkUi;
public class theater {

    public static Question<String> theater() {
        return actor ->  cinemarkUi.THEATER_REGISTER.resolveFor(actor).getText().trim();
    }

}
