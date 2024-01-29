package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class cinemarkUi {
    //Ventana de activa las notificaciones
    public static Target ALLOW_NOTIFICATIONS = Target.the("Activar las notificaciones")
            .located(By.id("com.android.permissioncontroller:id/permission_allow_button"));
    public static Target ALLOW_LOCATION = Target.the("Activar la localización")
            .located(By.xpath("//android.widget.Button[@content-desc=\"PERMITIR OBTENER UBICACIÓN\"]"));
    public static Target ACCESS_LOCATION = Target.the("Activar la localización")
            .located(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
    public static Target ACCESS_USER = Target.the("Ingresar a iniciar sesión y/o crear cuenta")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.Button"));

    //Registro de usuarios
    public static Target BUTTON_REGISTER = Target.the("Botón de Regístrarse")
            .located(By.xpath("//android.view.View[@content-desc='Registrarse']"));
    public static Target LIST_GENERAL = Target.the("Clic afuera de la lista para cerrar teclado")
            .located(By.xpath("(//*[@class='android.widget.ScrollView'])"));

    public static Target NAME_REGISTER = Target.the("Nombres")
            .located(By.xpath("(//*[@class='android.widget.EditText'])[1]"));
    public static Target LASTNAME_REGISTER = Target.the("Apellidos")
            .located(By.xpath("(//*[@class='android.widget.EditText'])[2]"));
    public static Target EMAIL_REGISTER = Target.the("Correo electrónico")
            .located(By.xpath("(//*[@class='android.widget.EditText'])[3]"));
    public static Target EMAIL_CONFIRMATION_REGISTER = Target.the("Confirmar Correo electrónico")
            .located(By.xpath("(//*[@class='android.widget.EditText'])[4]"));
    public static Target PHONE_REGISTER = Target.the("Celular")
            .located(By.xpath("(//*[@class='android.widget.EditText'])[5]"));
    public static Target ADDRESS_REGISTER = Target.the("Dirección")
            .located(By.xpath("(//*[@class='android.widget.EditText'])[6]"));
    public static Target CLIC_DOCUMENT_NUMBER_REGISTER = Target.the("Número de documento")
            .located(By.xpath("(//*[@class='android.widget.EditText'])[7]"));
    public static Target EDIT_DOCUMENT_NUMBER_REGISTER = Target.the("Número de documento")
            .located(By.xpath("(//*[@class='android.widget.EditText'])[6]"));
    public static Target CLIC_PASSWORD_REGISTER = Target.the("Clic en el cuadro de texto Contraseña")
            .located(By.xpath("(//*[@class='android.widget.EditText'])[5]"));
    public static Target EDIT_PASSWORD_REGISTER = Target.the("ingresa la Contraseña")
            .located(By.xpath("(//*[@class='android.widget.EditText'])[3]"));
    public static Target THEATER_REGISTER = Target.the("Teatro de preferencia")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Teatro de preferencia *\"]"));
    public static Target THEATER_OPTION_ONE = Target.the("Teatro lab v5 Floresta")
            .located(By.xpath("//android.view.View[@content-desc=\"Lab v5 Floresta\"]"));
    public static Target TERMS_AND_CONDITIONS = Target.the("Acepta terminos y condiciones")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[2]"));
    public static Target BUTTON_CONTINUE = Target.the("da clic en boton continuar")
            .located(By.xpath("//android.widget.Button[@content-desc=\"CONTINUAR\"]"));

    public static Target CLIC_CALENDAR = Target.the("da clic el calendario")
            .located(By.xpath("(//*[@class='android.view.View'])[5]"));
    public static Target EDIT_CALENDAR = Target.the("Editar El calendario")
            .located(By.xpath("(//*[@class='android.widget.Button'])[1]"));
    public static Target EDIT_DATE_CALENDAR = Target.the("Editar la fecha del calendario")
            .located(By.xpath("(//*[@class='android.widget.EditText'])[1]"));
    public static Target BUTTON_CALENDAR = Target.the("Aceptar modificación del calendario")
            .located(By.xpath("//android.widget.Button[@content-desc=\"ACEPTAR\"]"));


    //Localizadores de inicio de sesión
    public static Target EMAIL_LOGIN = Target.the("Correo electronico para inicio de sesión")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
    public static Target PASSWORD_LOGIN = Target.the("Contraseña para inicio de sesión")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
    public static Target BUTTON_LOGIN = Target.the("Botón de iniciar sesión")
            .located(By.xpath("//android.widget.Button[@content-desc=\"INICIAR SESIÓN\"]"));

}
