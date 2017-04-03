/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import apresentacao.Telacinema;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.CinemaDAO;
import persistencia.Conexao;

/**
 *
 * @author aluno
 */
public class Cinemarepository implements Irepository<Telacinema> {
    
        private final CinemaDAO  cinemaDAO;
       
        
        
      
        
        public Cinemarepository(){
        this.cinemaDAO = new CinemaDAO();
}
        
   
 
  
    @Override
    public ArrayList<String> sessaocheias() {
        try {
            return cinemaDAO.sessaocheias();
        } catch (SQLException ex) {
            return null;
        }
    }

    @Override
    public ArrayList<String> filmescaros() {
        try {
            return cinemaDAO.filmescaros();
        } catch (SQLException ex) {
            return null;
        }
    }


 

       
    
    
    

    
}
