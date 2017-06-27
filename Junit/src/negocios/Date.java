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
          if(mes==2 && bicesto(ano)){
          if(mes==2 && dia>30){
              throw new IllegalArgumentException("Erro");
          }
          }else{
               if(mes==2 && dia>29){
              throw new IllegalArgumentException("Erro");
          }
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
       String data; 
        if(this.day <10){
          data="0"+this.day+"/";  
        }else{
          data=this.day+"/";
        }
         if(this.month<10){
             data=data+"0"+this.month+"/"+this.year;
         } else{
            data=data+this.month+"/"+this.year;  
         }
                
                
                
                
      
    return data;
    }
    public boolean bicesto(int ano){
     if((ano%400==0) ||(ano%4==0 && ano%100!=0)){
         return true;
     } else{
         System.out.print("Este ano não é bicesto"+ano);
         return false;
     }  
    }
    
    @Override
    public boolean equals(Object data){
       String dt = this.toString();
       String dtnew = data.toString();
               if( dtnew.equals(dt)){
                  
                  return true; 
               
               }else{
                   
                   return false;
                  
               }
 
            }
    
    public boolean before(Object data){
       int dia = Integer.parseInt( data.toString().substring(0, 2));
       int mes = Integer.parseInt( data.toString().substring(3, 5));
       int ano = Integer.parseInt( data.toString().substring(6, 10));
     if(this.year<ano){
      return true;   
     } 
     if(this.year == ano && this.month<mes){
         return true;
     }
     if(this.day<dia && this.month==mes && this.year == ano){
        return true;  
     }
     
    return false;
    }
    
    public boolean after(Object data){
    int dia = Integer.parseInt( data.toString().substring(0, 2));
       int mes = Integer.parseInt( data.toString().substring(3, 5));
       int ano = Integer.parseInt( data.toString().substring(6, 10));
     if(this.year>ano){
      return true;   
     } 
     if(this.year == ano && this.month>mes){
         return true;
     }
     if(this.day>dia && this.month==mes && this.year == ano){
        return true;  
     }
     
    return false;
    }
    
    public Object minusdays(int dia){
    
    
    return new Date();
    }
    public Object plusdays(int dia){
        
         
   return new Date(); 
    }
    public Object tomorrow(int dia){
    int futureday = this.day+1;
    
    return new Date(futureday,this.month,this.year);
    }
    public Object yesterday(){
      int oldday = this.day-1;
      
         
   return new Date(oldday,this.month,this.year); 
    }
    
          
       
        
       
      
    


}
