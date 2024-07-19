# Parabank

AUTOMATIZACION DE PRUEBAS (WEB)
Requisitos de entrega:
1. Uso del lenguaje Java
2. Uso de Serenity BDD.
3. Uso de patrón de diseño de automatización a su elección
4. Uso de Gradle/Maven a su elección
5. Uso de la herramienta Cucumber
6. La automatización debe ser capaz de ejecutarse en los navegadores Chrome y Firefox.
7. Subir la automatización a un repositorio de GitHub.

### Caso de uso:
1. Registro:
      1.    Haga clic en Registro 
      2.	Rellene el formulario de registro con los datos requeridos 
      3.	Pulse de nuevo en <Registro>. 
      4.	Compruebe que el texto "Su cuenta se ha creado correctamente. En la pantalla se puede ver "You are now logged in". 

2. Abrir una nueva cuenta :
   1. Haga clic en Abrir nueva cuenta.
   2. En el apartado "¿Qué tipo de cuenta desea abrir?" seleccione la opción <SAVINGS>.
   3. Haga clic en <Abrir nueva cuenta>
   4. Compruebe si el texto "Congratulations, your account is now open." está visible en la pantalla

3. Transferir Fondos :
   1.	Haga clic en <Transferencia de fondos>
   2.	Compruebe que el texto "Transferir fondos" es visible en la pantalla
   3.	En el campo Importe: $ introduzca el importe a transferir
   4.	En el campo De la cuenta # seleccione una cuenta
   5.	En el campo a la cuenta # seleccione una cuenta distinta a la anterior
   6.	Haga clic en Transferencia
   7.	Compruebe que el texto "¡Transferencia completa!" es visible en la pantalla
   8.	Haga clic en Resumen de cuentas

## Patron de Diseño Utilizado
* ScreenPlay

## Features
* Dentro de cada Feature en los ejemplos, los datos de pueden inyectar diretamente al escenario. La primera fila son los nombres de las variables y las siguientes filas los valores de las mismas.
* Si se desea cambiar el navegador a usar en cada caso, esta parametrizado en el feature, y para cambiarlo entre las opciones solicitadas, solo es necesario en los ejemmplos  cambiar el valor de la variable "navegador" por : "firefox" o "chrome", según su elección.

La Aplicacion Parabank, fue dockerizada y Testeada en el endPoint local http://localhost:8080/parabank/index.htm
La imagen de Docker se puede descargar en:  https://hub.docker.com/r/parasoft/parabank/
O se puede ejecutar por consola  el comando: docker run -d -p 8080:8080 -p 61616:61616 -p 9001:9001 parasoft/parabank
