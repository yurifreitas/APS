/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import negocios.EnviarSMS;
import negocios.SMS;

/**
 *
 * @author APLPoloNaval
 */
public class AdapterOI implements  EnviarSMS {

    SMS sms;
    
    public AdapterOI(SMS sms) {
        this.setSms(sms);
    }
    
    public void setSms(SMS sms) {
        this.sms = sms;
    }
    @Override
    public void enviarSMS(String origem, String destino, String[] texto) {
        System.out.print(origem+destino+texto);
    }
    
}
