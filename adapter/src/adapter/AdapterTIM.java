/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import negocios.SMS;
import negocios.SMSsender;

/**
 *
 * @author APLPoloNaval
 */
public class AdapterTIM implements SMSsender {

    SMS sms;

    public AdapterTIM(SMS sms) {
        this.sms = sms;
    }

    public void setSms(SMS sms) {
        this.sms = sms;
    }

    @Override
    public boolean sendSMS(SMS sms) {
        System.out.print(sms.getDestino() + "\n" + sms.getOrigem() + "\n" + sms.getTexto());
        return true;
    }

}
