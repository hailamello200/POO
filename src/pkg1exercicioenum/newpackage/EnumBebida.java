/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1exercicioenum.newpackage;

import java.util.logging.Logger;

/**
 *
 * @author haila.159517
 */
public enum EnumBebida {
    
    SUCO("Suco" ,3.50f, "De laranja natural"),
    AGUA("Água" ,1.50f ," Mineral sem gás "),
    CHA("Chá" ,0.50f,"  Ervas secas "),
    CAFE("Café" , 3.50f,"  Expresso"),
    CERVEJA("Cerveja", 4.00f ,"Skol"),
    REFRI("Refri" ,5.00f ,"Pepsi"),
    MILSHAKE("MilkShake" ,4.50f, "De morango"),
    LEITE("Leite" , 4.00f , "Em caixinha, integral"),
    NESCAU("Nescau",3.50f, "Toddy"),
    IOGURTE("Iogurte", 2.50f, "Vigor Grego");
    
    private String nome;
    private float valor;
    private String descricao;

    private EnumBebida(String nome, float valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

   
    
    
}
