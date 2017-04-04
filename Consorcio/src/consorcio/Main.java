/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consorcio;

import negocio.Consorcio;
import negocio.Participa;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Consorcio consorcio = new Consorcio();
        consorcio.setNome("BV Financeira");
        
        
        Participa novoparticipante = new Participa("maria");
        Participa novoparticipante1 = new Participa("jose");
        Participa novoparticipante2 = new Participa("ana");
        Participa novoparticipante3 = new Participa("roberta");
        
      System.out.print("Entrou maria\n");
        consorcio.addObserver(novoparticipante);
      System.out.print("Entrou jose\n"); 
        consorcio.addObserver(novoparticipante1);
      System.out.print("Entrou ana\n");
        consorcio.addObserver(novoparticipante2);
        consorcio.removerObserver(novoparticipante1);
     
       System.out.print("Entrou roberta\n");
        consorcio.addObserver(novoparticipante3);
       
        
    }
    
}
