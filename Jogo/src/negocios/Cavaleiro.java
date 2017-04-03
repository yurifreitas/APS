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
public class Cavaleiro extends Personagem {
    
    public Cavaleiro(){
    super("Cavaleiro");
    setFightbehavior(new FightArcoeFlecha());
    
    }
   
  
    
}
