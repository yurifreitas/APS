/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author yuri
 */
public class Html extends Relatorio {

    @Override
    public void escrever() {

        
        try {
			FileWriter fr = new FileWriter("arquivo.html",false);
			BufferedWriter arq = new BufferedWriter(fr);
			arq.write("<table border='1px'>");
                        for(int i=0;i<pessoas.size();i++){
                        arq.write("<tr><td>"+pessoas.get(i).getCpf()+"</td><td>"+pessoas.get(i).getNome()+"</td><td>"+pessoas.get(i).getIdade()+"</td></tr>");
                        }
                        
                        arq.write("</table>");
			arq.close();
			System.out.println("Gravação de HTML feita com sucesso.");
		}catch(IOException e){
			System.out.println ("Houve um erro: " + e);
		}
    }
    
}
