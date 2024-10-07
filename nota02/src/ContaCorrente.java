package models;

public class ContaCorrente extends Conta {
    private double taxaDeOperacao = 0.05; // 5% de taxa sobre o valor da operação

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + (valor * taxaDeOperacao);
        if (valorComTaxa <= getSaldo()) {
            super.sacar(valorComTaxa);
            System.out.println("Taxa de operação aplicada: R$ " + (valor * taxaDeOperacao));
        } else {
            System.out.println("Saldo insuficiente para saque com a taxa de operação.");
        }
    }
}
