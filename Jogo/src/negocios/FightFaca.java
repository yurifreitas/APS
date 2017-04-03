/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author yuri
 */
public class FightFaca implements FightBehavior{
     
    @Override
    public void equipar() {
    
    System.out.print("Lutando com faca");
    
    
    }
      @Override
    public int incrementardano() {
         int danoarma = 15;
        return danoarma;
        
    }
}
