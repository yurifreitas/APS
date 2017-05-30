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
    private String host;
    private String porta;
    private String usuario;
    private String senha;
    private String banco;
    
    
    
    public void Conecao(){
        this.host = "localhost";
        this.porta = "5432";
        this.usuario = "postgres";
        this.senha = "postgres";
        this.banco = "cliente";
        
    }
     public Connection getConnection() {
        String url = "jdbc:postgresql://" + this.host + ":" + this.porta + "/" + this.banco;
        try {
            System.out.println("OK");
            return DriverManager.getConnection(url, this.usuario, this.senha);
        } catch (SQLException ex) {
            //Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Problema");
            System.exit(0);
        }
        return null;
    }
    
}
