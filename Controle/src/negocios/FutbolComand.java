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
public class FutbolComand implements Comand {
    JogoFutbol futbol;
    public FutbolComand(JogoFutbol futbol){
        this.futbol = futbol;
    }
    @Override
    public void X() {
        futbol.chutar();
    }

    @Override
    public void A() {
        futbol.passar();
    }
     @Override
    public void Y() {
        futbol.carrinho();
    }
    @Override
    public void B() {
        futbol.cruzar();
    }
    
}
