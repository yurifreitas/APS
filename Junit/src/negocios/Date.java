/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Date {
    
  
   public final int month; 
   public final int year; 
    public final int day; 
   
    
    
    public Date(){
      this.day = 1;
      this.month= 1;
      this.year=1900;
    }
    public Date(int dia,int mes, int ano){
     if(mes >12 || mes<1){
         throw new IllegalArgumentException("Erro");
     }
     
     
       
      if((dia <32 && dia>0) && ano>1899){
          if(mes==2 && dia>29){
              throw new IllegalArgumentException("Erro");
          }
          this.day = dia;
          this.year=ano;
          this.month=mes;
        } else
        
        if(dia>1899 && (ano<32 && ano>0)){ 
             if(mes==2 && ano>29){
              throw new IllegalArgumentException("Erro");
          }
            this.day = ano;
            this.year=dia;
            this.month=mes;
        }else {
           throw new IllegalArgumentException("Erro"); 
        }
       
     
     }
    
    @Override
    public String toString(){
       String data="0"+this.day+"/"+"0"+this.month+"/"+this.year;
    return data;
    }
    
    
    @Override
    public boolean equals(Object data){
        data.toString();
    return
            }
    
    
    
   
    
          
       
        
       
      
    


}
