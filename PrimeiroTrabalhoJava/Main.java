public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(123123 , "José Cardoso");
        System.out.println(f1.isAtivo()); // true

            System.out.println(f1.getNome());
        System.out.println(f1.getMatricula());
        System.out.println(f1.isAtivo());
    }
    
}
