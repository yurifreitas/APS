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
public class EntradaAdapter extends EntradaUSB {
    private EntradaPS2 ps2;

    public EntradaAdapter(EntradaPS2 ps2) {
        this.ps2 = ps2;
    }
    
   
    public void conecta(){
        ps2.conectarEntradaPS2();
    }
    
}
