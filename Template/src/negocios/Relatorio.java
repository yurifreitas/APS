/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author yuri
 */
public  abstract class Relatorio {
    
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    String [] texto;
    public final void gerar(){
        ler();
        
        escrever();
    }
    
    
    
    
    public void ler(){
        
        
        try{
			FileReader fr = new FileReader("arquivo.csv");
			BufferedReader br = new BufferedReader(fr);
			String s;
                        
			while((s = br.readLine())!=null) {
                            
                            texto=s.split(",");
                            
				 pessoas.add(new Pessoa(texto[0], texto[1], texto[2]));
                                 
			}

		}catch (IOException e){
			System.out.println ("Houve um erro: " + e);
                }
        
                             
                                     
                                 
   }
   
    
    
    protected abstract void escrever();
}
