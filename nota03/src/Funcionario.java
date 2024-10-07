public class Funcionario {
    private String nome;
    private int anoNasc; // Ano de nascimento
    private double salario;

    // Construtor
    public Funcionario(String nome, int anoNasc, double salario) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - this.anoNasc; // Calcula a idade
    }

    public double informarSalario() {
        return this.salario; // Retorna o salário
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNasc);
        System.out.println("Salário: " + salario);
        System.out.println("Idade: " + calcularIdade(2024));
    }
}
