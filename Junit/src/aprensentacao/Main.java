/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprensentacao;

import negocios.Date;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args){
    Date d = new Date();
    d = new Date(2000, 12, 25);
   
    
  //  d.day = 5;
  // d.month = 1;
  // d.year = 2001;
   // d = new Date(13, 7, 2016);
   

   
    // inválido (ambíguo)
    //d = new Date(1900, 7, 2016);

    // inválido (ano abaixo do mínimo 1900)
   // d = new Date(16, 7, 1899);

    // inválido (ano abaixo do mínimo 1900)
    //d = new Date(1899, 7, 16);

    // inválido (mês inválido)
   //d = new Date(2016, 13, 16);

    // inválido (dia inválido)
    //d = new Date(2016, 12, 32);

    // inválido (dia inválido)
    //d = new Date(2016, 12, -1);

    // inválido (mês inválido)
   // d = new Date(2016, -1, 16);

    // inválido (dia inválido)
   //d = new Date(2016, 2, 30);
   
   Date d8 = new Date(5, 5, 2005);
    System.out.println(d8.toString().equals("05/05/2005"));
    d8 = new Date(1, 10, 2001);
    System.out.println(d8.toString().equals("01/10/2001"));
     
    Date d5 = new Date(1, 7, 2014);
    Date d6 = new Date(1, 7, 2014);
    System.out.println(d5.equals(d6) == true);
    System.out.println(d5 +" "+ d6);
    System.out.println(d5.equals(new Date()) == false);
    
    
    
    }
}
