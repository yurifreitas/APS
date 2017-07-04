/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocios.Command;
import negocios.Placa;
import negocios.PlacaMae;
import negocios.PlacamaeCommand;


/**
 *
 * @author aluno
 */
public class Main {
    private  Placa placas;
    public static void main(String[] args){
        Placa placas;
       PlacaMae placa = new PlacaMae();
       Command placa1 = new PlacamaeCommand(placa);
       
      placas = new Placa(placa1);
      
      placas.resetar();
      placas.desligar();
      placas.hibernar();
    }
}
