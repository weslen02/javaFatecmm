package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite o nome do sujeito:%n");
        String nome = leitor.nextLine();
        System.out.println("nome digitado = " + nome);
        //exemplos com conversao de tipo
        int a;
        double b;
        System.out.println("Digite um valor para a: ");
        a = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite um valor para b: ");
        Locale.setDefault(Locale.US);
        b = Double.parseDouble(leitor.nextLine());
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        double c = Double.parseDouble("356.89f");

        Produto p1 = new Produto();
        p1.idCodigo = 1;
        p1.nome = "Heineken";
        p1.valor = 3.89;
        System.out.println(p1.toString());
    }
}
