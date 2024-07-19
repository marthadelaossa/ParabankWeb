#language: es
Característica: CASO3 Abrir Cuenta

  @CASO2
  Esquema del escenario: Abrir Cuenta Exitosamente
    Dado       que el usuario se encuentra en la pagina <navegador> <url>
    Cuando     el usuario inicia sesion
    Y          el usuario abra una cuenta
    Entonces   el usuario valida la apertura de la cuenta

      Ejemplos:
      | navegador | url|
      |chrome|http://localhost:8080/parabank/index.htm|



