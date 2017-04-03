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
public class Combate {
    private Personagem lutador1;
    private Personagem lutador2;
    private Personagem lutador3;
    
    FightMachado machado = new FightMachado();
    FightEspada espada = new FightEspada();
    FightFaca faca = new FightFaca();
    FightArcoeFlecha arco = new FightArcoeFlecha();
    
    public Combate(){
        lutador1 = new Rei();
        lutador2 = new Cavaleiro();
        lutador3 = new Rainha();
    }
    
    
    public void lutar(){
       
        int i=0;
       
       
        
        while (lutador1.getHP() >= 0 && lutador2.getHP() >= 0 && lutador3.getHP() >= 0){
          i++; 
           
          // Começa Jogo
            lutador1.incrementardano();
            lutador2.incrementardano();
            System.out.print(lutador1.getnome()+" HP = "+lutador1.getHP()+" Dano: "+lutador1.getDano()+" X ");
            System.out.print(lutador2.getnome()+" HP = "+lutador2.getHP()+" Dano: "+lutador2.getDano()+"\n");
            lutador1.equipar();System.out.print(" X ");lutador2.equipar();System.out.print("\n");
            
           
            
       
           
            
            
            //Testa personagens vivos
            lutador1.setHP(lutador1.getHP()-lutador2.getDano());
            
            if(lutador1.getHP()<=0){
                System.out.print(lutador2.getnome()+" HP = "+lutador2.getHP()+ " Venceu ");
                System.out.print(lutador1.getnome()+" HP = "+lutador1.getHP()+"\n");
                break;
            }
            else if(lutador2.getHP()<=0){
                System.out.print(lutador1.getnome()+" HP = "+lutador1.getHP()+ " Venceu ");
                System.out.print(lutador2.getnome()+" HP = "+lutador2.getHP()+"\n");
                break;
            }
            
            lutador2.setHP(lutador2.getHP()-lutador1.getDano());
            
            if(lutador1.getHP()<=0){
                System.out.print(lutador2.getnome()+" HP = "+lutador2.getHP()+ " Venceu ");
                System.out.print(lutador1.getnome()+" HP = "+lutador1.getHP()+"\n");
                break;
            }
            else if(lutador2.getHP()<=0){
                System.out.print(lutador1.getnome()+" HP = "+lutador1.getHP()+ " Venceu ");
                System.out.print(lutador2.getnome()+" HP = "+lutador2.getHP()+"\n");
                break;
            }
            
            lutador1.setFightbehavior(machado);
            lutador2.setFightbehavior(faca);
     
        
       }
    }
    }
    

