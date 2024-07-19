package com.parasoft.parabank.enums;

public enum DatosDB {
    DB_JDBC_DRIVER ( "org.h2.Driver"),
    DB_URL ("jdbc:h2:~/test;INIT=RUNSCRIPT FROM 'create.sql'"),
    DB_USER ( "sa"),
    DB_PASSWORD ( "");
    private final String dataBase;
    DatosDB(String dataBase) {
        this.dataBase = dataBase;
    }

    public static String dataBase (DatosDB datosDB){
        return datosDB.dataBase;
    }

}
