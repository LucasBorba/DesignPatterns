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
public abstract class FormaPagamento {
    private Produto produto;
    public FormaPagamento(Produto produto){
        this.produto = produto;
    }
    
    private float calculaValorTotal(Produto p){
        float valorTotal = p.getValor();
        System.out.println("Calculando Valor Total: " + valorTotal);
        return valorTotal;
    }
    
    private float calculaDesconto(float valorTotal){
        float desconto = valorTotal - valorTotal * 0.10f;
        System.out.println("Calculando desconto: " + desconto);
        return desconto;
    }
    
    private void baixaEstoque(){
        System.out.println("Dando baixa no estoque");
    }
    
    private void recalculaCaixa(){
        System.out.println("Recalculando caixa");
    }
    
    private void imprimirPedido(){
        System.out.println("Imprimindo pedido");
    }
    
    protected abstract void formaDePagamento();
    
    public void realizarPagamento(){
        calculaDesconto(calculaValorTotal(produto));
        formaDePagamento();
        imprimirPedido();
        baixaEstoque();
        recalculaCaixa();
    }
}
