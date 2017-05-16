/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import adapter.AdapterOI;
import adapter.AdapterTIM;
import negocios.SMS;

/**
 *
 * @author APLPoloNaval
 */
public class Main {

    public static void main(String[] args) {

        SMS sms = new SMS("igor", "OI", "mensagem teste");

        

        AdapterTIM tim = new AdapterTIM(sms);
        tim.sendSMS(sms);
        
        
        AdapterOI oi = new AdapterOI(sms);
        oi.sendSMS(sms);

    }
}
