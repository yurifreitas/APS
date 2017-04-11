/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao;

import negocios.Leilao;
import negocios.Participa;

/**
 *
 * @author yuri
 */
public class Leilaomain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        Leilao leilao = new Leilao();
        leilao.setNome("LEilão 1");
        
        
        Participa novoparticipante = new Participa("maria",100);
        Participa novoparticipante1 = new Participa("jose",120);
        Participa novoparticipante2 = new Participa("ana",10);
        Participa novoparticipante3 = new Participa("roberta",50);
        
      
        leilao.addObserver(novoparticipante);
        System.out.println("#########################");
        leilao.addObserver(novoparticipante1);
        System.out.println("#########################");
        leilao.addObserver(novoparticipante2);
         System.out.println("#########################");
        leilao.addObserver(novoparticipante3);
       
        
        // TODO code application logic here
    }
    
}
