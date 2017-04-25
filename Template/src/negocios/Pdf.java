/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yuri
 */
public class Pdf extends Relatorio {

    @Override
    public void escrever() {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("arquivo.pdf"));
             document.open();

            for (int i = 0; i < pessoas.size(); i++) {

                document.add(new Paragraph (pessoas.get(i).getCpf() + " - " + pessoas.get(i).getNome() + " - " + pessoas.get(i).getIdade() + "\n"));
            }
            document.close();
            System.out.println("Gravação de PDF feita com sucesso.");
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
