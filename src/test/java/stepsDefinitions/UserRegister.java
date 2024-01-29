package stepsDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.task.start;
import org.example.task.testDataTable;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserRegister {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^(.*) quiere abrir la aplicación$")
    public void actorWantsBuyShirts(String actor) {
        theActorCalled(actor).attemptsTo(
        );
    }

    @When("^acepta activar localización$")
    public void OpertationAritmetic() {
        Serenity.takeScreenshot();
        theActorInTheSpotlight().attemptsTo(
                new start()
        );
    }

    @Then("^diligencio campos de resgistro$")
    public void selectday(DataTable dataTable) {
        List<Map<String, String>> AccountDataList = dataTable.asMaps();
        for (Map<String, String> accountData : AccountDataList) {
            String Nombres = accountData.get("Nombres");
            String Apellidos = accountData.get("Apellidos");
            String correoElectronico = accountData.get("correoElectronico");
            String confirmarCorreo = accountData.get("confirmarCorreo");
            String Celular = accountData.get("Celular");
            String Direccion = accountData.get("Direccion");
            String NumDocumento = accountData.get("NumDocumento");
            String Contrasena = accountData.get("Contrasena");

            theActorInTheSpotlight().attemptsTo(
                    testDataTable.dataDate(Nombres, Apellidos, correoElectronico, confirmarCorreo, Celular, Direccion, NumDocumento, Contrasena)
            );
        }
    }

}
