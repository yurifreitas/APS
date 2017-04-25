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
public class Txt extends Relatorio {

    @Override
    public void escrever() {
        try {
            FileWriter fr = new FileWriter("arquivo.txt", false);
            BufferedWriter arq = new BufferedWriter(fr);
            for (int i = 0; i < pessoas.size(); i++) {

                arq.write(pessoas.get(i).getCpf() + " - " + pessoas.get(i).getNome() + " - " + pessoas.get(i).getIdade() + "\n");
            }

            arq.close();
            System.out.println("Gravação de TXT feita com sucesso.");
        } catch (IOException e) {
            System.out.println("Houve um erro: " + e);
        }
    }
}
