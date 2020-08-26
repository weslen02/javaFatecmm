package com.fatec.maromo.aula02_1;

public class Academico {

    public static void main(String[] args) {
	// write your code here
        //Declarando aluno1
        Aluno aluno1;
        //Declarando e instanciando o aluno2
        Aluno aluno2 = new Aluno();
        int x = 10;

        //Instancia do aluno1
        aluno1 = new Aluno();

        //Dados/valores sendo atribuidos para o aluno1
        aluno1.nome = "Joao";
        aluno1.email = "joao@mail.com";
        aluno1.rm = 1;

        //Dados/valores sendo atribuidos para o aluno2
        aluno2.nome = "Maria";
        aluno2.email = "maria@mail.com";
        aluno2.rm = 2;

        //Matricular os dois alunos
        aluno1.matricular();
        aluno2.matricular();

        //Cancelar Matricula dos dois alunos
        aluno1.cancelarMatricula();
        aluno2.cancelarMatricula();
    }
}
