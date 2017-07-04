/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocios.Oi;

/**
 *
 * @author aluno
 */
public class TestProva {
    public static void main(String[] args){
        Oi oi= new Oi();
        System.out.println(oi.x(2));
        System.out.println(oi.w(2));
        for(int i=0;i<10; i++){
            System.out.println(i+" : "+oi.y(i));
            
        }
    }
    
}
