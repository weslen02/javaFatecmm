package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cliente clientes[] = new Cliente[5];

        //ERRADO tem que fazer a montagem na pilha de referencia com new
        //clientes[0].nome = "Marcos";

        clientes[0] = new Cliente();
        clientes[0].nome = "Marcos";

        for (Cliente cliente:clientes) {
            if (cliente!=null) cliente.listar();
        }
    }
}
