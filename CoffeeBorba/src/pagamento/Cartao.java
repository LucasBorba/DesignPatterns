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
public class Cartao extends FormaPagamento{

    public Cartao(Produto produto) {
        super(produto);
    }
    protected void formaDePagamento(){
        System.out.println("Pagamento realizado em Cartão");
    }
}
