package codigoEstudos;

public class LojaChina {

    private String codigo;
    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEstoque;
    

    public LojaChina(String codigo, String nome, String categoria, double preco, int quantidadeEstoque) {

        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
       
    }
    public boolean estaDisponivel() {
        return quantidadeEstoque > 0;
    }
    public boolean desconto(){
        return preco>100;

    }

    public void status() {

        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Disponível: " + estaDisponivel());
        System.out.println("Pode receber desconto?" + desconto());
    }
}