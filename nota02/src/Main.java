import java.util.Scanner;
import models.ContaCorrente;
import models.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        System.out.println("Bem-vindo ao banco!");

        // Operações com Conta Corrente
        System.out.println("Depósito na Conta Corrente:");
        System.out.print("Digite o valor para depositar: ");
        double valorDeposito = sc.nextDouble();
        cc.depositar(valorDeposito);

        System.out.println("\nSaque na Conta Corrente:");
        System.out.print("Digite o valor para sacar: ");
        double valorSaque = sc.nextDouble();
        cc.sacar(valorSaque);

        // Operações com Conta Poupança
        System.out.println("\nDepósito na Conta Poupança:");
        System.out.print("Digite o valor para depositar: ");
        valorDeposito = sc.nextDouble();
        cp.depositar(valorDeposito);

        System.out.println("\nAplicar juros na Conta Poupança:");
        cp.aplicarJuros();

        sc.close();
    }
}
