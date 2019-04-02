package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class ComputadorTeste {

    public static void main(String[] args)  {
        // write your code here
        //Primeiro Objeto
        Computador c1 = new Computador();
        //Atribuição de valores
        c1.marca = "hp";
        c1.cor = "prata";
        c1.modelo = "novo";
        c1.numeroSerie = 123;
        c1.preco = 1500.09;
        //invocar o imprimir
        c1.imprimir();
        //invocar o calcular valor
        c1.calcularValor();
        System.out.println();//pular linha
        //invoca o imprimir novamente
        c1.imprimir();
        System.out.println(" ");
        System.out.println("----------C2------");
        //Repetir a operação para o computador c2
        Computador c2 = new Computador();
        c2.cor = "preta";
        c2.modelo = "velho";
        c2.numeroSerie = 456;
        c2.preco = 2500.99;
        c2.marca = "ibm";
        c2.imprimir();
        c2.calcularValor();
        c2.imprimir();
        //invocar o metodo alterarValor passando
        //um valor positivo e verificando o retorno
        //se 1 alterado, caso contrário nao alterado
        if(c2.alterarValor(5000.0)==1){
            System.out.println("Preco Alterado");
        }else{
            System.out.println("Preco nao alterado");
        }
        c2.imprimir();
    }
}
