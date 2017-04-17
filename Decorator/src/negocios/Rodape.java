/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author yuri
 */
public class Rodape extends CorpoDecorator{
    
     public Rodape(Email email){        
        this.corpo = email;
    }
    
    @Override
    public String getDescription() {
        return this.corpo.getDescription() + "\n<br><b>Yuri Bezerra Freitas</b> \n <br>Contato: yuribzfreitas@gmail.com \n <br><b>Análise e Desenvolvimento de Sistemas</b>";    
    }
    
}
