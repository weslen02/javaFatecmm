package com.company;

public class ContaTeste {

    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Instanciar a própria classe para ter acesso ao atributo cc (Conta) - representante de uma conta;*/
        ContaTeste ct = new ContaTeste();
        int opc=0;
        do{
            System.out.println("MENU");
            System.out.println("1..Cadastrar");
            System.out.println("2..Consultar");
            System.out.println("3..Depositar");
            System.out.println("4..Sacar");
            System.out.println("9..SAIR");
            System.out.println("Digite sua opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    ct.cadastrar();
                case 2:

                case 3:

                case 4:

                case 9:
                    break;

                default:

            }
        }while(opc!=9);

    }
    public void cadastrar(){

    }

    public void consultar(){

    }

    public void sacar(){

    }

    public void depositar(){

    }

}