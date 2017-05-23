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
public class Veiculo implements Veiculo_P {

    String ano;
    String modelo;
    String placa;
    String chassi;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Veiculo(String ano, String modelo, String placa, String chassi) {
        this.ano = ano;
        this.modelo = modelo;
        this.placa = placa;
        this.chassi = chassi;
    }

    @Override
    public void manobrar(Empregado empregado) {
        System.out.print("Funcionario" + empregado.getNome() + " dirigindo o carro : " + this.modelo + " com habilitação de numero : ");
    }

}
