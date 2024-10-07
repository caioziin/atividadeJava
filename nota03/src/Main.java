import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario("João", 1991, 3500.0);

        System.out.println("Digite seu salario: ");
        f.setSalario(sc.nextDouble());

        System.out.println("Digte seu nome: ");
        f.setNome(sc.next());

        System.out.println("Digite o ano de nascimento: ");
        f.setAnoNasc(sc.nextInt());


        f.informarSalario();
        f.exibirDados();
    }
}