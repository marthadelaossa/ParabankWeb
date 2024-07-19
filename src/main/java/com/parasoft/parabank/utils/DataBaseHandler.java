package com.parasoft.parabank.utils;

import net.serenitybdd.screenplay.Actor;
import org.h2.tools.Server;

import java.sql.*;
import java.util.*;

import static com.parasoft.parabank.enums.DatosDB.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DataBaseHandler {

    static Connection connection;
    static Statement statement;

    public static void iniciarConexion() throws SQLException, ClassNotFoundException {
        Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092").start();
        Server server=Server.createWebServer().start();

        System.out.println("Servidor H2 iniciado. Conecta con JDBC URL: jdbc:h2:tcp://localhost/~/test");
        System.out.println("H2 Console está disponible en: " + server.getURL());

        Class.forName(dataBase(DB_JDBC_DRIVER));
        connection = DriverManager.getConnection(dataBase(DB_URL), dataBase(DB_USER), dataBase(DB_PASSWORD));
        statement = connection.createStatement();
    }



    public Map<Integer, Map<String, String>> getDatos() throws SQLException, ClassNotFoundException {
        iniciarConexion();
        Map<Integer, Map<String, String>> clientes = new HashMap<>();
        try {
            String selectSql = "SELECT * FROM clientes ;";
            ResultSet resultSet = statement.executeQuery(selectSql);
            int index = 1;
            while (resultSet.next()) {
                Map<String, String> clienteData = new HashMap<>();
                clienteData.put("userName", resultSet.getString("userName"));
                clienteData.put("password", resultSet.getString("password"));
                clientes.put(index, clienteData);
                index++;
            }

            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public void setDatos() throws SQLException, ClassNotFoundException {
        Actor actor=theActorInTheSpotlight();
        iniciarConexion();
        try {
            String selectSql = " INSERT INTO clientes (userName, password) VALUES ('"+actor.recall("userName")+"','"+actor.recall("password")+"')";
            statement.executeUpdate(selectSql);
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}


