package codigoEstudos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PRODUTO 1
        System.out.println("=== Produto 1 ===");

        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Categoria: ");
        String categoria = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Estoque: ");
        int quantidadeEstoque = sc.nextInt();
        sc.nextLine();

        LojaChina produto1 = new LojaChina(
                codigo,
                nome,
                categoria,
                preco,
                quantidadeEstoque
        );

        // PRODUTO 2
        System.out.println("\n=== Produto 2 ===");

        System.out.print("Código: ");
        String codigo2 = sc.nextLine();

        System.out.print("Nome: ");
        String nome2 = sc.nextLine();

        System.out.print("Categoria: ");
        String categoria2 = sc.nextLine();

        System.out.print("Preço: ");
        double preco2 = sc.nextDouble();

        System.out.print("Estoque: ");
        int estoque2 = sc.nextInt();
        sc.nextLine();

        LojaChina produto2 = new LojaChina(
                codigo2,
                nome2,
                categoria2,
                preco2,
                estoque2
        );

        // EXIBIÇÃO
        System.out.println("\n--- DADOS DOS PRODUTOS ---");

        System.out.println("\nProduto 1:");
        produto1.status();

        System.out.println("\nProduto 2:");
        produto2.status();

        sc.close();
    }
}