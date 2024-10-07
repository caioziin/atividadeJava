import java.util.Scanner;

class Produto {
    private int codigo;
    private String nome;
    private String tamanhoPeso;
    private String cor;
    private double valor;
    private int quantidadeEstoque;

    public Produto(int codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getValor() {
        return valor;
    }

    public void exibirProduto() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Tamanho/Peso: " + tamanhoPeso);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }

    public void venderProduto(int quantidade, String formaPagamento) {
        if (quantidade > quantidadeEstoque) {
            System.out.println("Estoque insuficiente.");
            return;
        }

        double valorFinal = valor * quantidade;

        if (formaPagamento.equalsIgnoreCase("pix") || formaPagamento.equalsIgnoreCase("especie")
                || formaPagamento.equalsIgnoreCase("transferencia") || formaPagamento.equalsIgnoreCase("debito")) {
            valorFinal *= 0.95; // 5% de desconto
        }

        System.out.println("Valor final: R$ " + valorFinal);
        quantidadeEstoque -= quantidade;
    }

    public void calcularTroco(double valorPago, double valorFinal) {
        if (valorPago > valorFinal) {
            double troco = valorPago - valorFinal;
            System.out.println("Troco: R$ " + troco);
        }
    }
}