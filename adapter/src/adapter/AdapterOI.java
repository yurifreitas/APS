/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.ArrayList;
import java.util.List;

import negocios.OI;
import negocios.SMS;
import negocios.SMSsender;

/**
 *
 * @author APLPoloNaval
 */
public class AdapterOI implements SMSsender {

    SMS sms;
    OI oi;

    public AdapterOI(SMS sms) {
        this.setSms(sms);
    }

    public void setSms(SMS sms) {
        this.sms = sms;
    }

    @Override
    public boolean sendSMS(SMS sms) {
        char letras []=null;
        String texto;
        
        for(int i=0;sms.getTexto().length()>i;i++){
           letras = sms.getTexto().toCharArray();
           texto=String.copyValueOf(letras);
           System.out.print(texto);
        }
        //oi.enviarSMS(sms.getOrigem(), sms.getDestino(), texto);
   return true; }

    

}
