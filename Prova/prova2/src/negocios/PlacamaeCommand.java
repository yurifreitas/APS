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
public class PlacamaeCommand implements Command {
    PlacaMae arduino;
    public PlacamaeCommand(PlacaMae arduino){
        this.arduino = arduino;
    }
    @Override
    public void Desligar() {
      arduino.shutdown();
    }

    @Override
    public void Resetar() {
        arduino.restart();
    }

    @Override
    public void Hibernar() {
        arduino.hibernate();
    }
    
}
