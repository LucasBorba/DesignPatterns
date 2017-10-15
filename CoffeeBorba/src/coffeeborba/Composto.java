/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeborba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SCROEDINGER
 */
public class Composto extends Produto{
    private Produto p1;
    private Produto p2;
    private List<Observador> observadores = new ArrayList<>();
    
    public Composto(Produto p1, Produto p2){
        this.p1 = p1;
        this.p2 = p2;
        
        addObservador(new Celular());
        addObservador(new Tablet());
        addObservador(new DesktopUsuario());

        notificaTodos(this);
    }
    
    public float getValor(){
        return p1.getValor() + p2.getValor();
    }
    
    public String getNome(){
        return p1.getNome() + " - " + p2.getNome();
    }
    
    private void notificaTodos(Produto p){
        for(Observador o : observadores){
            o.Notifica(p);
        }
    }
    
    public void addObservador(Observador o){
        observadores.add(o);
    }
}
