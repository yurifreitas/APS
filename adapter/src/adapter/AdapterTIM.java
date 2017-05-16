/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import negocios.EnviarSMS;
import negocios.SMS;
import negocios.SMSsender;


/**
 *
 * @author APLPoloNaval
 */
public class AdapterTIM implements EnviarSMS {

   private SMSsender smssender;

    public AdapterTIM(SMSsender smssender) {
        this.smssender = smssender;
    }


    @Override
    public void enviarSMS(String origem, String destino, String[] texto) throws Exception {
        SMS sms = new SMS();
        sms.setDestino(destino);
        sms.setOrigem(origem);
        String textos="";
        for(String l : texto){
            textos += l+ " ";
        }
        sms.setTexto(textos);
        System.out.println(sms);
        smssender.sendSMS(sms);
        

    }

}
