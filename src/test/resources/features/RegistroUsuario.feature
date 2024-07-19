#language: es
Característica: CASO1 Registro de Usuario

  @CASO1 @registroCorrectoUsuario
  Esquema del escenario: Registro Correcto de Usuario
    Dado       que el usuario se encuentra en la pagina <navegador> <url>
    Cuando     el usuario se registra como usuario
    Entonces   el usuario valida la creacion de su usuario exitosamente

      Ejemplos:
      | navegador | url|
      |chrome|http://localhost:8080/parabank/index.htm|



