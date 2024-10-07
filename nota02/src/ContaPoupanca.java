package models;

public class ContaPoupanca extends Conta {
    private double taxaDeJuros = 0.01; // 1% de juros sobre o saldo

    // Método para aplicar juros
    public void aplicarJuros() {
        double saldoAtual = getSaldo();
        double juros = saldoAtual * taxaDeJuros;
        depositar(juros);  // Adiciona os juros ao saldo
        System.out.println("Juros aplicados: R$ " + juros);
    }
}
