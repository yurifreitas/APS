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
public class FightArcoeFlecha implements FightBehavior {
    
    @Override
    public void equipar() {
        
        System.out.print("Lutando com Arco e flecha");
    
    }
    @Override
    public int incrementardano() {
        int danoarma = 18;
        return danoarma;
        
    }
    
}
