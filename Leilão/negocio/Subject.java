/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author aluno
 */
public interface Subject {
    
     public void addObserver(Observer observer); 
     
      public void removerObserver(Observer observer);
     
     public void notifyObservers();
    
}
