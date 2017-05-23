/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocios.Empregado;
import negocios.Proxy;
import negocios.Veiculo;

/**
 *
 * @author aluno
 */
public class View {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empregado empregado = new Empregado("antonio",18);
        Veiculo veiculo = new Veiculo("2008", "3526", "2525", "0000000");
        
      Proxy proxy = new Proxy(veiculo);
      proxy.manobrar(empregado);     
      
        
        
        
    }
    
}
