/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import java.sql.SQLException;
import java.util.Scanner;
import persistencia.ClienteDao;

/**
 *
 * @author APLPoloNaval
 */
public class Facade {

    private Cliente c;
    private ClienteDao cdao;
    Scanner ler = new Scanner(System.in);

    public void cadastra() throws SQLException {
        cdao = new ClienteDao();

        System.out.println("Digite o CPF do cliente");
        String cpf = ler.nextLine();

        // metodo de colsulta
        if (cdao.Consulta(cpf) == true) {

            //Se existir cria e insere
            c = new Cliente();
            c.setCpf(cpf);
            System.out.println("Digite o Nome do cliente");
            String nome = ler.nextLine();
            c.setNome(nome);

            // metodo de insersão
            cdao.Inserir(c.getNome(), c.getCpf());
        } else {
            System.out.print("CPF:" + cpf + " já cadastrado");
        }

    }

}
