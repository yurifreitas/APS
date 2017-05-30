/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

        Connection connection = Conecao.getInstance();
        String sql = "Select * from pessoa where cpf like '" + cpf + "';";
        PreparedStatement st = connection.prepareStatement(sql);

        ResultSet rs = st.executeQuery();

        if (rs.next() == true) {
            return false;
        }

        return true;
    }

    public void Inserir(String nome, String cpf) throws SQLException {
        Connection connection = Conecao.getInstance();
        String sql = "INSERT INTO public.pessoa(nome, cpf) VALUES (?, ?);";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, nome);
        st.setString(2, cpf);
        st.executeUpdate();

        System.out.println("Cliente : " + nome + " CPF : " + cpf + "Cadastrado com sucesso");

    }

}
