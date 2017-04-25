/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author yuri
 */
public class XML extends Relatorio {

    @Override
    public void escrever() {
        try {
            FileWriter fr = new FileWriter("arquivo.xml", false);
            BufferedWriter arq = new BufferedWriter(fr);
            arq.write("<?xml version=\"1.0\"?><contatos>");
            for (int i = 1; i < pessoas.size(); i++) {
                arq.write("<contato><cpf>" + pessoas.get(i).getCpf() + "</cpf><nome>" + pessoas.get(i).getNome() + "</nome><idade>" + pessoas.get(i).getIdade() + "</idade></contato>");
            }

            arq.write("</contatos>");
            arq.close();
            System.out.println("Gravação de XML feita com sucesso.");
        } catch (IOException e) {
            System.out.println("Houve um erro: " + e);
        }
    }
}
