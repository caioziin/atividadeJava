public class Gerente extends Funcionario {

    private String projeto;

    // Construtor da classe Gerente
    public Gerente(String nome, int anoNasc, double salario, String projeto) {
        super(nome, anoNasc, salario); // Chama o construtor da classe Funcionario
        this.projeto = projeto;
    }

    public String informarProjeto() {
        return this.projeto;
    }

    // Setter para definir o projeto do gerente
    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getProjeto() {
        return this.projeto;
    }
}
