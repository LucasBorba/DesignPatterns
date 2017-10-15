/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeborba;

import pagamento.FormaPagamento;

/**
 *
 * @author SCROEDINGER
 */
public abstract class Produto {
    private ModoServir modoServir;
    private FormaPagamento formaPagamento;

    public abstract String getNome();
    public abstract float getValor();
    
    public String getModo(){
        return modoServir.modo();
    }
    
    public void setModo(ModoServir modoServir){
        this.modoServir = modoServir;
    }
    
    public void setFormaPagamento(FormaPagamento formaPagamento){
        this.formaPagamento = formaPagamento;
    }
    
    public void realizaPagamento(){
        formaPagamento.realizarPagamento();
    }
}
