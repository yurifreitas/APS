/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import adapter.AdapterOI;
import adapter.AdapterTIM;
import negocios.OI;
import negocios.SMS;
import negocios.TIM;

/**
 *
 * @author APLPoloNaval
 */
public class Main {

    public static void main(String[] args) throws Exception {

      
        
        
       AdapterTIM adaptertim = new AdapterTIM(new TIM());
        adaptertim.enviarSMS("(53)8106-5474", "(53)8106-5474", new String[]{"alom","bla","sadada",""});
        System.out.print("\n******************************************* "+"\n");
        AdapterOI adapteroi = new AdapterOI(new OI());
        adapteroi.sendSMS(new SMS("(53)8106-5474","(53)8106-5474","Theodor Weissenberger (Mühlheim am Main, 21 de Dezembro de 1914 – Nürburgring, 11 de Junho de 1950) foi um piloto alemão da Luftwaffe durante a Segunda Guerra Mundial. Voou mais de 500 missões de combate, nas quais abateu 208 aeronaves inimigas, o que fez dele um dos maiores ases da historia da aviação. A maioria das suas vitórias foram alcançadas perto do Oceano Árctico, no sector norte da Frente Oriental, contudo também abateu 33 aeronaves inimigas na Frente Ocidental, incluindo 8 enquanto pilotava o avião a jacto Messerschmitt Me 262."));

       

    }
}
