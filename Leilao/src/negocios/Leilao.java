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

    import java.util.ArrayList;

/**
 *
 * @author aluno
 */
 public class Leilao implements Subject {
    private String nome;
    private double lance;

    public double getLance() {
        return lance;
    }

    public void setLance(double lance) {
        this.lance = lance;
    }
    private ArrayList<Observer> participantes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public Leilao() {
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
                int maior = 0;
        boolean ganhou =false;
        
         
        for (int i = 0; i < participantes.size(); i++) {
            Observer participante = participantes.get(i);
        if(participante.getLance() >participantes.get(maior).getLance()){
             maior=i;
         
         ganhou=true;
            
        }
        
     
          
        
    }
        if(ganhou = true){
          this.notifyObservers(); 
          for (int i = 0; i < participantes.size(); i++) {
              if(participantes.get(i).getNome() != participantes.get(maior).getNome()){
              System.out.print(participantes.get(i).getNome() +" O lance de "+participantes.get(maior).getNome()+" Foi o maior no valor de "+participantes.get(maior).getLance()+"\n");
              }
              else{
                 System.out.print(participantes.get(i).getNome()+" o seu foi o maior lance de "+participantes.get(i).getLance()+"\n"); 
              }
              }
        }
         
    }
    
   
    
    
    public void removerObserver(Observer observer) {
        this.participantes.remove(observer);
        this.notifyObservers();
    }
    
     
    public void notifyObservers() {        
        for (int i = 0; i < participantes.size()-1; i++) {
            Observer participante= participantes.get(i);
            participante.update(participantes.get(i).getNome() ,participantes.get(i).getLance());
    }
    }
}
    

