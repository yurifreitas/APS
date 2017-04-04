/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Consorcio implements Subject {
    private String nome;
    private ArrayList<Observer> participantes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public Consorcio() {
        this.participantes = new ArrayList();
    }  

    public ArrayList<Observer> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Observer> participantes) {
        this.participantes = participantes;
    }
  
    
   
    public void addObserver(Observer observer) {
        this.participantes.add(observer);
        this.notifyObservers();       
    }
    
    
    
    public void removerObserver(Observer observer) {
        this.participantes.remove(observer);
        this.notifyObservers();
    }
    
     
    public void notifyObservers() {        
        for (int i = 0; i < participantes.size()-1; i++) {
            Observer participante = participantes.get(i);
            participante.update(this.participantes.get(this.participantes.size()-1).getNome());            
        }
    }
    
}
