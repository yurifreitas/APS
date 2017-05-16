/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author APLPoloNaval
 */
public class SMS {

    private String destino;
    private String origem;
    private String texto;

    public SMS() {
        
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public SMS(String destino, String origem, String texto) {
        this.destino = destino;
        this.origem = origem;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "SMS\n" + " Destino = " + destino + "\n Origem = " + origem + "\n Texto = " + texto+"\n" ;
    }

}
