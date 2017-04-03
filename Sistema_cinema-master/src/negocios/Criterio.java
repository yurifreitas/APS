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
public class Criterio {
    public String sql;
    
    public Criterio(){
        this.sql = "";
    }
    
    public Criterio where(String atributo , Object parametro){
        this.sql += " where " + atributo + " = '"+ parametro + "'";   
        return this;
    }

    public Criterio andWhere(String atributo , Object parametro){
        this.sql += " and " + atributo + " = '"+ parametro + "'";   
        return this;
    }    
    
 
    public String gerarSQL(){
        return this.sql;
    }
    
}
