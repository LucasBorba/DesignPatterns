/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamento;

import coffeeborba.Produto;

/**
 *
 * @author SCROEDINGER
 */
public class Dinheiro extends FormaPagamento{

    public Dinheiro(Produto produto) {
        super(produto);
    }
    protected void formaDePagamento(){
        System.out.println("Pagamento realizado em Dinheiro");
    }
}
