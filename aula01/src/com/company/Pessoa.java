package com.company;
//metodos construtores identificam o acesso atraves da assinatura (valor passado), ----exemplo nao esta aqui----

public class Pessoa {
    /*Definindo atributos*/
    public String nome;
    public int idade;
    public double peso, altura;

    /*definir os metodos*/
    public double calcularImc(){
        return peso / (Math.pow(altura, 2.0));
    }

    public void imprimir(){
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("peso = " + peso);
        System.out.println("altura = " + altura);

    }

}
