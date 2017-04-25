/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocios.Html;
import negocios.Pdf;
import negocios.Relatorio;
import negocios.Txt;
import negocios.XML;

/**
 *
 * @author yuri
 */
public class Main {
    
    public static void main(String[] args) {
    Relatorio rl_pdf = new Pdf();
    Relatorio rl_html = new Html();
    Relatorio rl_xml = new XML();
    Relatorio rl_txt = new Txt();
    rl_txt.gerar();
    rl_html.gerar();
    rl_xml.gerar();
    rl_pdf.gerar();
    
    
    
    
    }
    
    
}
