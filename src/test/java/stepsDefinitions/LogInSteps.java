package stepsDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.task.LogIn;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogInSteps {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Then("inicia sesión con sus credenciales")
    public void selectday(DataTable dataTable) {
        List<Map<String, String>> AccountDataList = dataTable.asMaps();
        for (Map<String, String> accountData : AccountDataList) {
            String usuario = accountData.get("USUARIO Y/O CORREO ELECTRONICO");
            String contraseña = accountData.get("CONTRASEÑA");

            theActorInTheSpotlight().attemptsTo(
                    LogIn.dataDate(usuario, contraseña)
            );
        }
    }
}
