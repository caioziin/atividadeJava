import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();


        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Digite a nota da primeira prova: ");
        aluno.setNota1(scanner.nextDouble());

        System.out.print("Digite a nota da segunda prova: ");
        aluno.setNota2(scanner.nextDouble());

        System.out.print("Digite a nota da terceira prova: ");
        aluno.setNota3(scanner.nextDouble());

        aluno.calcularMedia();
        aluno.exibirDetalhesAluno();

        scanner.close();
    }
}