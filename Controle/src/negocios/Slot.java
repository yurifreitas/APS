/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import javax.swing.JOptionPane;

/**
 *
 * @author APLPoloNaval
 */
public class Slot {
    Comand slot1;
    Comand slot2;

 
    public void setSlot1(Comand slot1) {
        this.slot1 = slot1;
    }

   

    public void setSlot2(Comand slot2) {
        this.slot2 = slot2;
    }
    

    public Slot(Comand slot1, Comand slot2){
        this.slot1 = slot1;
        this.slot2 = slot2;
    }
    public void buttonX(int slot) {
        if (slot == 1) {
            this.slot1.X();
        } else if (slot == 2) {
            this.slot2.X();
        }else{
           JOptionPane.showMessageDialog(null, "Opa!! meu velho fica dificil Jogar sem jogo ");
        }
    }

    public void buttonA(int slot) {
        if (slot == 1) {
            this.slot1.A();
        } else if (slot == 2) {
            this.slot2.A();
        }else{
           JOptionPane.showMessageDialog(null, "Opa!! meu velho fica dificil Jogar sem jogo ");
        }
    }
    public void buttonY(int slot) {
        if (slot == 1) {
            this.slot1.Y();
        } else if (slot == 2) {
            this.slot2.Y();
        }else{
           JOptionPane.showMessageDialog(null, "Opa!! meu velho fica dificil Jogar sem jogo ");
        }
    }
    public void buttonB(int slot) {
        if (slot == 1) {
            this.slot1.B();
        } else if (slot == 2) {
            this.slot2.B();
        }else{
           JOptionPane.showMessageDialog(null, "Opa!! meu velho fica dificil Jogar sem jogo ");
        }
    }
    
    
}
