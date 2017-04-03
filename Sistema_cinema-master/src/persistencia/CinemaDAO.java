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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import negocios.Filme;
import negocios.Sala;
import negocios.Sessao;

/**
 *
 * @author yuri
 */
public class CinemaDAO 
{
    public void insert(String extrato,String nome_fil,String horario,int quant ) throws SQLException 
    {
        
    Connection connectionSingleton = Conexao.getInstance();
     String sql = "INSERT INTO public.\"Ticket\"(\n" +
"             extrato,nome_filme,horario,quant_bilhete)\n" +
"    VALUES (?, ?,?,?);";
        PreparedStatement sqlPrepare = connectionSingleton.prepareStatement(sql);
        
        sqlPrepare.setString(1, extrato);
        sqlPrepare.setString(2, nome_fil);
        sqlPrepare.setString(3, horario);
        sqlPrepare.setInt(4, quant);
        sqlPrepare.executeUpdate();
        
       
    }
    
    public boolean Delet(String condicao) throws SQLException 
    {
    Connection connectionSingleton = Conexao.getInstance();
     String sql = "DELETE FROM public.\"Ticket\"\n" +" WHERE "+condicao+";";
        PreparedStatement sqlPrepare = connectionSingleton.prepareStatement(sql);
        
        int resultado = sqlPrepare.executeUpdate();
        sqlPrepare.close();
        connectionSingleton.close();
        return resultado == 1;
    }
    
    
    
    
    
   
    
    public ArrayList<Filme> lista() throws SQLException{
        
        String sql = "SELECT  \"Nome\", preco\n" +
"  FROM public.\"Filmes\";";
        PreparedStatement sqlPrepare = null;
        ResultSet rs = null;
        
        ArrayList<Filme> filmes = new ArrayList<>();
        Connection connectionSingleton = Conexao.getInstance();
        try
        {
         sqlPrepare = connectionSingleton.prepareStatement(sql);
         rs = sqlPrepare.executeQuery();
        while (rs.next())
        { 
           Filme filme = new Filme();
       
           filme.setNome(rs.getString("Nome"));
           filme.setPreco(rs.getDouble("preco"));
           

      
            filmes.add(filme);
            
          
        }
        }
        catch(SQLException ex)
        {
            System.err.printf("erro", ex);
        }
        finally{
            sqlPrepare.close();
                    
        }
        return filmes;
}
    public ArrayList<Sessao> listasessao() throws SQLException{
        
        String sql = "SELECT  horario\n" +
"  FROM public.\"Sessao\";";
        PreparedStatement sqlPrepare = null;
        ResultSet rs = null;
        
        ArrayList<Sessao> sessoes = new ArrayList<>();
        Connection connectionSingleton = Conexao.getInstance();
        try
        {
         sqlPrepare = connectionSingleton.prepareStatement(sql);
         rs = sqlPrepare.executeQuery();
        while (rs.next())
        { 
           Sessao sessao = new Sessao();
       
           sessao.setHorario(rs.getString("horario"));
          
           

      
            sessoes.add(sessao);
            
          
        }
        }
        catch(SQLException ex)
        {
            System.err.printf("erro", ex);
        }
        finally{
            sqlPrepare.close();
                    
        }
        return sessoes;
}
     public ArrayList<Sala> listasalas() throws SQLException{
        
        String sql = "SELECT \"Capacidade\", \"Nome\"\n" +
"  FROM public.\"Sala\";";
        PreparedStatement sqlPrepare = null;
        ResultSet rs = null;
        
        ArrayList<Sala> salas = new ArrayList<>();
        Connection connectionSingleton = Conexao.getInstance();
        try
        {
         sqlPrepare = connectionSingleton.prepareStatement(sql);
         rs = sqlPrepare.executeQuery();
        while (rs.next())
        { 
           Sala sala = new Sala();
       
           sala.setNome(rs.getString("Nome"));
           sala.setCapacidade(rs.getInt("Capacidade"));
           

      
            salas.add(sala);
            
          
        }
        }
        catch(SQLException ex)
        {
            System.err.printf("erro", ex);
        }
        finally{
            sqlPrepare.close();
                    
        }
        return salas;
}
     public ArrayList<String> sessaocheias() throws SQLException {
        Connection connectionSingleton = Conexao.getInstance();
        String sql="";
        PreparedStatement sqlPrepare = connectionSingleton.prepareStatement(sql);
        ResultSet rs = sqlPrepare.executeQuery();
        ArrayList<String> retorno = new ArrayList();
        while (rs.next()) {
            
        }
        return retorno;
    }
    
 public ArrayList<String> filmescaros() throws SQLException {
        Connection connectionSingleton = Conexao.getInstance();
        String sql = " ";
        PreparedStatement sqlPrepare = connectionSingleton.prepareStatement(sql);
        ResultSet rs = sqlPrepare.executeQuery();
        ArrayList<String> retorno = new ArrayList();
        while (rs.next()) {
           
        }
        return retorno;
    }
    
}
