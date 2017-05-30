/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author APLPoloNaval
 */
public class ClienteDao {

    Conecao conecao = new Conecao();

    public boolean Consulta(String cpf) throws SQLException {

        Statement st = conecao.getConnection().createStatement();
        String sql = "Select * from cliente where cpf=" + cpf + ";";

        st.executeQuery(sql);
        ResultSet rs = st.getResultSet();
        if (rs.next()) {
            return false;
        } else {
            return true;
        }

    }

    public void Inserir(String nome, String cpf) throws SQLException {
        Statement st = conecao.getConnection().createStatement();
        String sql = "INSERT INTO cliente(nome,cpf) VALUES (" + nome + "," + cpf + ");";

        st.executeQuery(sql);

        System.out.println("Cliente : " + nome + " CPF : " + cpf + "Cadastrado com sucesso");

    }

}
