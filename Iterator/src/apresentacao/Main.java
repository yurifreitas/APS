/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocios.Cardapios;
import negocios.CoffeMenu;
import negocios.PankakeMenu;
import negocios.SandubaMenu;

/**
 *
 * @author APLPoloNaval
 */
public class Main {
     public static void main(String[] args) {
        // TODO code application logic here
        Cardapios c = new Cardapios(new PankakeMenu(),new CoffeMenu(), new SandubaMenu());
        c.printMenu();
    }
    
}
