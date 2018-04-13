/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1exercicioenum;

import javax.swing.JOptionPane;
import pkg1exercicioenum.newpackage.EnumBebida;

/** 
 *
 * @author haila.159517
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String listaDeProdutos="";
        
       for (EnumBebida e : EnumBebida.values()){
           listaDeProdutos+= e.getNome()+" " + e.getValor()+ " " + e.getDescricao()+" \n";   
       }
    String bebidaEscolhida =  JOptionPane.showInputDialog("Qual bebida você quer? \n" +listaDeProdutos );
       for (EnumBebida e: EnumBebida.values()){
           if(bebidaEscolhida.toUpperCase().contains(e.getNome().toUpperCase()));
           JOptionPane.showMessageDialog(null,e.getNome());
           
       }
    }
    
}
