#language: pt

Funcionalidade: Comprar Produto
    Esquema do Cenario: Compra com Sucesso
        Dado que acesso o My Demo App
        E verifico o logo e o nome da secao
        E localizo o <produto> que esta por <preco>
        Quando clico na imagem do <num_produto>
        Entao verifico o <produto> e o <preco> na tela do produto
        Quando arrasto para cima e clico no botão Add Cart
        Entao na tela do carrinho verifico o <produto> <preco> e <quantidade>
