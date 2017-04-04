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
        
        
        Participa novoparticipante = new Participa("maria",100);
        Participa novoparticipante1 = new Participa("jose",120);
        Participa novoparticipante2 = new Participa("ana",10);
        Participa novoparticipante3 = new Participa("roberta",50);
        
      
        consorcio.addObserver(novoparticipante);
        System.out.println("#########################");
        consorcio.addObserver(novoparticipante1);
        System.out.println("#########################");
        consorcio.addObserver(novoparticipante2);
         System.out.println("#########################");
        consorcio.addObserver(novoparticipante3);
       
        
    }
    
}
