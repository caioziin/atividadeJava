import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cadastro do produto com todos os atributos
        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();
        sc.nextLine(); // Limpar o buffer

        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite o tamanho/peso do produto: ");
        String tamanhoPeso = sc.nextLine();

        System.out.print("Digite a cor do produto: ");
        String cor = sc.nextLine();

        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble(); // Certifique-se de que o valor digitado aqui seja numérico.

        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEstoque = sc.nextInt();

        Produto produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);

        // Exibe produto e realiza venda
        produto.exibirProduto();

        System.out.print("Digite a quantidade a vender: ");
        int quantidade = sc.nextInt();
        sc.nextLine(); // Limpar o buffer
        System.out.print("Digite a forma de pagamento (Pix, Espécie, Transferência, Débito, Crédito): ");
        String formaPagamento = sc.nextLine();

        produto.venderProduto(quantidade, formaPagamento);

        if (formaPagamento.equalsIgnoreCase("especie")) {
            System.out.print("Digite o valor pago: ");
            double valorPago = sc.nextDouble();
            produto.calcularTroco(valorPago, produto.getValor() * quantidade * 0.95);
        }

        sc.close();
    }
}