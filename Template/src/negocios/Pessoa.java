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
public class Pessoa {

   
    private String nome;
    private String cpf;
    private String idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Pessoa( String cpf,String nome, String idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
     @Override
    public String toString() {
        return    " cpf=" + cpf + "nome=" + nome + " idade=" + idade ;
    }
}
