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
    private double lance;
    
    
     public Participa(String nome,double lance) {
        this.nome = nome;
        this.lance=lance;
    }
    @Override
    public void update(String nomep,double lance) {
         System.out.println(this.nome+":  "+nomep +" acabou de dar o lance maior o lance de "+this.lance);
       
    }
   
    public double getLance() {
        return this.lance;
    }

    @Override
    public String getNome() {
        return this.nome;
       
    }
    
}
