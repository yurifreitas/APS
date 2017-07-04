/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocios.EntradaAdapter;
import negocios.EntradaPS2;
import negocios.EntradaUSB;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args){
        EntradaPS2 ps2 = new EntradaPS2();
        EntradaUSB usb= new EntradaUSB();
        usb.conectarUSB();
        EntradaAdapter porta = new EntradaAdapter(ps2);
        porta.conecta();
    }
}
