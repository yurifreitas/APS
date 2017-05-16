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
        int min=0 , lim=160,max=lim;
        if (mensagem.length() % lim == 0) {
            vetsms = new String[mensagem.length() / lim];
            for (int i = 0; i < vetsms.length; i++) {
                vetsms[i] = mensagem.substring(min, max);
                min = max;
                max += lim;
            }
        }else {
            vetsms = new String[(mensagem.length() / lim) + 1];
            for (int i = 0; i < (mensagem.length() / lim); i++) {
                vetsms[i] = mensagem.substring(min, max);
                min = max;
                max += lim;
            }
        }
        vetsms[vetsms.length - 1] = mensagem.substring(min, mensagem.length());
            for (int i = 0; i < vetsms.length; i++) {
                System.out.println("\n Destino: "+ sms.getDestino()+"\n Origem: "+sms.getOrigem()+"\n Texto: "+vetsms[i]);
        try {
            enviarsms.enviarSMS(sms.getDestino(), sms.getOrigem(), vetsms);
        } catch (Exception ex) {
            Logger.getLogger(AdapterOI.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            

      
        
     return true;
    }

 
    

}
