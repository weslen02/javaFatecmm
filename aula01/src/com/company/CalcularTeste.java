package com.company;

public class CalcularTeste {

    public static void main(String[] args) {

        //write your code here

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "chico";
        pessoa1.peso = 110;
        pessoa1.altura = 1.72;
        pessoa1.idade = 52;

        System.out.printf("IMC do %s%né: %f%n%nDados da pessoa" ,pessoa1.nome, pessoa1.calcularImc());
        pessoa1.imprimir();
    }
}
