package com.company;

public class Produto {
    public int id;
    public String nome;
    public double valor;
    public int qtdEstoque;



    public void regEtrada( int qtd ) {
        qtdEstoque += qtd;
    }

    public boolean regSaida(int qtd) {
        if(qtd <= qtdEstoque) {
            qtdEstoque += qtd;
            System.out.println("qtd = " + qtd);
        }
    }

    public void imprimir() {

    }
}

