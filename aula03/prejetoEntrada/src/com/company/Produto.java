package com.company;

/**
 * @author weslen
 * @since today
 * @version 1.0.1
 */

public class Produto {
    public int idCodigo;
    public String nome;
    public double valor;

    /**
     *
     * @return Dados do produto ativo
     */

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Codigo = ").append(idCodigo).append("\n");
        dados.append("Nome = ").append(nome).append("\n");
        dados.append("valor = ").append(valor).append("\n");
        return dados.toString();
    }
}
