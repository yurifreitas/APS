/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author APLPoloNaval
 */
public interface EnviarSMS {

    public void enviarSMS(String origem, String destino, String[] texto) throws Exception; 
    
    
}
