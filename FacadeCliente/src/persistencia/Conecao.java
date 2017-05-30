/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author APLPoloNaval
 */
public class Conecao {

    private static String host = "localhost";
    private static String database = "cliente";
    private static String user = "postgres";
    private static String port = "5432";
    private static String password = "postgres";
    private static Connection singleton = null;

    public Conecao() {

    }

    public static synchronized Connection getInstance() throws SQLException {
        String url = "jdbc:postgresql://" + Conecao.host + ":" + Conecao.port + "/" + Conecao.database;
        if (singleton == null) {
            singleton = DriverManager.getConnection(url, Conecao.user, Conecao.password);
        }
        return singleton;

    }
}
