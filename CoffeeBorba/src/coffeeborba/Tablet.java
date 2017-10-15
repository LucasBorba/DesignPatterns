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
public class Tablet implements Observador{
    public void Notifica(Produto p){
        System.out.println("(Tablet) Itens: "+ p.getNome());
    }
}
