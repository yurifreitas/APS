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
public class LutaComand implements Comand {
    JogoLuta luta;
    public LutaComand(JogoLuta luta){
        this.luta = luta;
    }
    @Override
    public void X() {
        luta.Combo();
    }

    @Override
    public void A() {
        luta.Soco();
    }
     
    @Override
    public void Y() {
        luta.Agarrao();
    }
    @Override
    public void B() {
        luta.Chute();
    }


}
