package coffeeborba;

import pagamento.Dinheiro;

public class CoffeeBorba {

    public static void main(String[] args) {
       
       Produto p1 = new Simples("Café", 1.00f);
       Produto p2 = new Simples("Acucar", 2.00f);
       Produto p3 = new Simples("Leite", 1.00f);
       Produto p4 = new Simples("Chocolate", 2.00f);
       
       Produto c1 = new Composto(p1, p2);
       Produto c2= new Composto(c1, p3);
       
       c2.setModo(new Xicara());
       System.out.println(c2.getModo());
       
       
       c2.setFormaPagamento(new Dinheiro(c2));
       c2.realizaPagamento();
    }
    
}
