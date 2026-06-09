public class Funcionario {
    // atributos
    private int matricula;
    private String nome;

    // construtor
    public Funcionario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    // regra calculada (não precisa armazenar "ativo")
    public boolean isAtivo() {
        return matricula <= 1000000;
    }
}