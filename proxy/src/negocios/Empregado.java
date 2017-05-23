/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Empregado {
    String nome;
    int idade;
    int CNH;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getidade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }



    public int getCNH() {
        return CNH;
    }

    public void setCNH(int CNH) {
        this.CNH = CNH;
    }

    public Empregado(String nome, int idade) {
        this.nome = nome;
        
        this.idade = idade;
        if(idade >= 18){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o numero da carteira de morotista");
            this.CNH =scanner.nextInt();
            
            
        }else
        {
            this.CNH=0;
        }
    }
    
   
}
