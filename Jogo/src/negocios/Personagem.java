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
public abstract class  Personagem {
    private FightBehavior fightbehavior;
    private String personagem;
    private int HP = 200;
    private int dano ;
    

 

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
    
    public Personagem(String nome){
        personagem = nome;
    }
    
    
    public void equipar(){
        fightbehavior.equipar();
    }
      public void incrementardano(){
          setDano(fightbehavior.incrementardano());
    }

    public FightBehavior getFightbehavior() {
        return fightbehavior;
    }

    public void setFightbehavior(FightBehavior fightbehavior) {
        this.fightbehavior=fightbehavior;
    }
    public String getnome(){
        return personagem;
    }



    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }


    
}
