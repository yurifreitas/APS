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
public class TIM extends SMS implements SMSsender{

    public TIM(String destino, String origem, String texto) {
        super(destino, origem, texto);
    }

    @Override
    public boolean sendSMS(SMS sms) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
