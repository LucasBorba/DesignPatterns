/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeborba;

/**
 *
 * @author SCROEDINGER
 */
public class Simples extends Produto{
    private String nome;
    private float valor;
    
    public Simples(String nome, float valor){
        this.nome  = nome;
        this.valor = valor;
    }
    
    public String getNome(){
        return nome;
    }
    
    public float getValor(){
        return valor;
    }
}
