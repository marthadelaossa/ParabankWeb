#language: es
Característica: CASO2 Transferir Fondos

  @CASO3 @transFerirFondos
  Esquema del escenario: Transferir Fondos Exitosamente
    Dado       que el usuario se encuentra en la pagina <navegador> <url>
    Cuando     el usuario inicia sesion
    Y          el usuario realiza una transferencia <monto>
    Entonces   el usuario valida la transferencia

    Ejemplos:
      | navegador | url|monto|
      |chrome|http://localhost:8080/parabank/index.htm|100|

