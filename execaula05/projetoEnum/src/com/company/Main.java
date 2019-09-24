package com.company;

public class Main {

    //enum é usado para coisas que nao se altera

    public static void main(String[] args) {

        Cartao mCartao = new Cartao();

        mCartao.nome = "Douglas";
        mCartao.limite = 5000.0;
        mCartao.anoVcto = 2020;
        mCartao.mesVcto = Meses.JUNHO;


        System.out.println("vencimento: ");
        System.out.println("ano = " + mCartao.anoVcto);
        System.out.println("mes = " + mCartao.mesVcto);

        Meses vetor[] = Meses.values();
        for (Meses mes:vetor) {

            System.out.println(mes.ordinal() + " = " + mes);
0
        }
    }
}
