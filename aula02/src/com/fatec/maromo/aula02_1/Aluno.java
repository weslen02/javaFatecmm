package com.fatec.maromo.aula02_1;

public class Aluno {
    public int rm;
    public String nome;
    public String email;

    public void matricular() {
        //Escrever o código da funcionalidade matricular

        System.out.println("Aluno matriculado com Sucesso.");
        System.out.println("Dados do Aluno");
        System.out.println(imprimir());
        System.out.println("----------------------");
    }

    private String imprimir() {
        return "RM:" + rm + ", Nome: " + nome + ", Email: " + email;
    }

    public void cancelarMatricula() {

        System.out.println("Aluno Cancelado com Sucesso.");
        System.out.println("Dados do Aluno:");
        System.out.println(imprimir());
        System.out.println("----------------------");
    }
}
