package com.fatec.maromo.aula02_2;

public class Main {
    public static void main(String[] args) {
        //Declarandao, instanciando e passando valores para meu objeto (construtor)
        Produto produto1 = new Produto(1, "SBP Anti aedes",  12.99);

        //compra de produtos, alimentando o estoque
        produto1.comprar(10);

        //venda de produtos dentro do que ha em estoque
        produto1.vender(5);

        //venda para erro, estoque inferior a venda
        produto1.vender(6);

    }

}
