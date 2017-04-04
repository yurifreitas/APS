/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author aluno
 */
public class Participa implements Observer {
    private String nome;
    
    
     public Participa(String nome) {
        this.nome = nome;
    }
    @Override
    public void update(String nomep) {
         System.out.println(this.nome +" Acabou de entrar no consorcio "+nomep);
       
    }

    @Override
    public String getNome() {
        return this.nome;
       
    }
    
}
