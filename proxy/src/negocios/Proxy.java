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
public class Proxy implements Veiculo_P {

    private Veiculo veiculo;

    public Proxy(Veiculo veiculo) {
        this.veiculo = veiculo;
    }   
    

    @Override
    public void manobrar(Empregado empregado) {
        if (empregado.getCNH() == 0) {
            System.out.print("O funcionario nao pode manobrar por ser menor de idade");

        } else {
            this.veiculo.manobrar(empregado);
        }
    }

}
