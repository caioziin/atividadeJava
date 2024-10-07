package models;

public class Conta {
    private double saldo;

    public Conta() {
        this.saldo = 0.0;
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado! Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado! Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}
