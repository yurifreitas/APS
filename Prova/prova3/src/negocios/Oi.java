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
public class Oi {
    public int x(int z){
        if(z == 1 || z ==0){
            return 1;
        }else
        {
            return z*x(z-1);
        }
    }
    public boolean w(int z){
        if(z == 2){
            return true;
        }
        if(z%2 ==0){
            return false;
           
        }
        int o=1;
        while(z%o != 0 || o !=z){
            o++;
        }
        return o ==z;
    }
    public int y(int z){
        if(z==0){
            return 0;
        }
        if(z ==1 || z ==2){
            return 1;
            
        }else{
            return y(z-1) + y(z-2);
        }
    }
}
