/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import persistencia.CinemaDAO;

/**
 *
 * @author aluno
 */
public class Filme {

   
    String nome;
    Double preco;

   
    
    
    @Override
    public String toString() {
        return  nome + "  R$ " + preco ;
    }

   
    
    
    
    
    
    
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

  
  



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

 
    
    
    
    
}
