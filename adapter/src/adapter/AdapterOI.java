/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;


import java.util.logging.Level;
import java.util.logging.Logger;
import negocios.EnviarSMS;
import negocios.SMS;
import negocios.SMSsender;


public class AdapterOI implements SMSsender {
    private EnviarSMS enviarsms;

    public AdapterOI(EnviarSMS enviarsms) {
        this.enviarsms = enviarsms;
    }


    @Override
    public boolean sendSMS(SMS sms) {
       String mensagem = sms.getTexto();
       String vetsms[] = null;
        System.out.print(sms);

        try {
            enviarsms.enviarSMS(sms.getDestino(), sms.getOrigem(), vetsms);
        } catch (Exception ex) {
            Logger.getLogger(AdapterOI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     return true;
    }

 
    

}
