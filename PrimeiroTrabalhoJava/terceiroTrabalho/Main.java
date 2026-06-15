package terceiroTrabalho;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // evento 1
        System.out.println("=== evento 1 ===");

        System.out.print("codigo do evento: ");
        String eventoCod = sc.nextLine();

        System.out.print("Nome: ");
        String eventoNome = sc.nextLine();

        System.out.print("localização do evento: ");
        String eventoLoc = sc.nextLine();

        System.out.print("Preço: ");
        double eventoValor = sc.nextDouble();

        System.out.print("vagas: ");
        int eventoVaga = sc.nextInt();
        sc.nextLine();

        System.out.print("carga horária do evento: ");
        int eventoHoras = sc.nextInt();
        sc.nextLine();

        if (eventoVaga == 0) {
            JOptionPane.showMessageDialog(null, "As vagas acabaram");
        } else if (eventoVaga <= 10) {
            JOptionPane.showMessageDialog(null, "As vagas estão acabando");
        } else {
            JOptionPane.showMessageDialog(null, "Ainda temos muitas vagas");
        }

        evento evento1 = new evento(
                eventoCod,
                eventoNome,
                eventoLoc,
                eventoValor,
                eventoVaga,
                eventoHoras);

        // evento 2
        System.out.println("=== evento 2 ===");

        System.out.print("codigo do evento: ");
        String eventoCod2 = sc.nextLine();

        System.out.print("Nome: ");
        String eventoNome2 = sc.nextLine();

        System.out.print("localização do evento: ");
        String eventoLoc2 = sc.nextLine();

        System.out.print("Preço: ");
        double eventoValor2 = sc.nextDouble();

        System.out.print("vagas: ");
        int eventoVaga2 = sc.nextInt();
        sc.nextLine();

        System.out.print("carga horária do evento: ");
        int eventoHoras2 = sc.nextInt();
        sc.nextLine();

        evento evento2 = new evento(
                eventoCod2,
                eventoNome2,
                eventoLoc2,
                eventoValor2,
                eventoVaga2,
                eventoHoras2);

        System.out.println("--- Informações sobre os eventos ---");

        System.out.println("Evento 1:");
        evento1.status();

        System.out.println("Evento 2:");
        evento2.status();

        sc.close();
    }
}
