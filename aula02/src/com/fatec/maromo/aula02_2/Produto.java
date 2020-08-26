package com.fatec.maromo.aula02_2;

public class Produto {
    //atributos
    private int cod;
    private String nome;
    private int qtdEstoque;
    private double valorProduto;

    //Construtor
    public Produto(int codigo, String nome, double valorProduto) {
        this.cod = codigo;
        this.nome = nome;
        this.valorProduto = valorProduto;
    }

    //gets and sets (modificadores de acesso) - atalho --> alt+insert


    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public boolean vender(int qtd) {
        if(this.qtdEstoque >= qtd) {
            this.qtdEstoque -= qtd;
            System.out.println("Venda realizada com sucesso!");
            System.out.println(imprimir());
            System.out.println("----------------------");
            return true;
        }
        System.out.println("Atencao!!!");
        System.out.println("Estoque vazio ou inferior ao pedido");
        System.out.println("Quantidade em estoque: " + this.qtdEstoque);
        System.out.println("----------------------");
        return false;
    }

    public boolean comprar(int qtd) {
        System.out.println("Compra realizada com sucesso!");
        System.out.println(imprimir());
        System.out.println("----------------------");
        this.qtdEstoque += qtd;
        return true;
    }

    public String imprimir() {
        return "Codigo: "
                + cod
                + ", Nome: "
                + nome
                + ", Quantidade: "
                + qtdEstoque
                + ", Valor do produto: "
                + valorProduto;
    }
}
