Feature: Deseo registrarme y realizar login como futuro usuario de Cinemark

  Como usuario de cinemark
  Quiero realizar registro en la app
  Para evitar hacer filas y hacer compras online

  @TestOne
  Scenario: Registrarse en la aplicación
    Given Usuario quiere abrir la aplicación
    When acepta activar localización
    Then diligencio campos de resgistro
      | Nombres | Apellidos | correoElectronico    | confirmarCorreo      | Celular    | Direccion | NumDocumento | Contrasena |
      | Felipe  | Daza      | andres20@hotmail.com | andres20@hotmail.com | 3135553399 | Calle 85  | 11009911     | v6q@rUy6   |

  @TestTwo
  Scenario: Loguearse con usuario a la aplicación
    Given Usuario quiere abrir la aplicación
    When acepta activar localización
    When inicia sesión con sus credenciales
      | usuario             | contraseña  |
      | pepitoP@pruebas.com | Prueba12Te* |

  #@TestThree
  #Scenario: Hacer flujo completo de
    #Given Usuario quiere abrir la aplicación
    #When acepta activar localización
    #When inicia sesión con sus credenciales
      #| usuario             | contraseña  |
      #| pepitoP@pruebas.com | Prueba12Te* |
