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
public class OI extends SMS implements EnviarSMS{

    public OI(String destino, String origem, String texto) {
        super(destino, origem, texto);
    }

    @Override
    public void enviarSMS(String origem, String destino, String[] texto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}