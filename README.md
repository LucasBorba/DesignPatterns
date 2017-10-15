# CoffeeBorba

Bem vindo ao CoffeBorba, a melhor cafeteria que você vai encontrar hoje.
A CoffeeBorba possui várias funcionalidades tecnológicas, e flexiblibilades para agradar nossos clientes. São elas:

  - Você possui várias opções para incrementar seu café da maneira que você gosta.
  - Você pode escolher o modo que será servido! Caso queira levar o café pra casa, basta trazer sua garrafa.
  - Aceitamos pagamento em cartão, cheque ou dinheiro.
  - Você não vai se assustar com a conta, pois você consegue observar em tempo real o que está sendo inserido no seu café! Utilize nosso app no seu celular, ou acompanhe pelo nosso desktop ou pelo tablet em cima da sua mesa!

# Vamos aos padrões!

### Composite

O composite foi utilizado para que possa ser possível incrementar o café da maneira que o cliente desejar. Ele permite que os itens incrementais sejam tratados da mesma maneira que um café composto por várias coisas. Além disso, é possível cadastrar qualquer produto novo no sistema.

### Observer

Para maior comodidade dos clientes, eles podem acompanhar em tempo real o que está sendo inserido no seu café. Isso só é possível graças ao Observer! Cada vez que cria o objeto composto, é chamado o método que notifica o celular, tablet, ou desktop.


### Strategy

O CoffeeBorba permite que você escolha o modo que deseja ser servido! Você quer o café na xícara, caneca, ou quer levar para casa em uma garrafa? O Strategy permite que você possa escolher isso. Mas e se você escolher um modo, e depois querer alterá-lo? Deve escolher todos os itens do café novamente? Nada disso, o Strategy permite a alteração do comportamento em tempo de execução, sem precisar recriar o objeto!


### Template

Vários processos são feitos ao concluir a compra, desde receber o pagamento, verificar descontos, até dar baixa no estoque. É uma sequência de passos que não pode ser alterada, porém a forma de pagamento pode escolhida pelo cliente. Cheque, Cartão ou Dinheiro? Não dá pra adivinhar. Então foi implementado o Template para que o cliente tenha essa flexibilidade! Assim, a sequência de passos é mantida, e o pagamento é realizado da maneira que o cliente desejar!


**Até a próxima!**
