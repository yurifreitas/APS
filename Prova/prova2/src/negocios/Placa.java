/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author aluno
 */
public class Placa {
    Command placa1;

    public Placa(Command placa1) {
        this.placa1 = placa1;
    }

    public Command getPlaca1() {
        return placa1;
    }

    public void setPlaca1(Command placa1) {
        this.placa1 = placa1;
    }
    public void desligar(){
        this.placa1.Desligar();
    }
    public void resetar(){
        this.placa1.Resetar();
    }
    public void hibernar(){
        this.placa1.Hibernar();
    }
}
