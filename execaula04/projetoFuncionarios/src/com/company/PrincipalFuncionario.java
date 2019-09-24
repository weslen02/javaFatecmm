package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PrincipalFuncionario {

    int T = 10;
    int indice;
    Func funcionario[] = new Func[3];



    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int opc = 0;



        do{
            System.out.printf("\tMENU\n1.cadastrar\n2.consultar\n3.bonificar,9.sair\n");
            switch (opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("valor invalido");
            }

        }while(opc!=9);
    }
}
