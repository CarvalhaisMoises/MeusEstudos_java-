package terceiroTrabalho;

public class evento {

    private String eventoCod;
    private String eventoNome;
    private String eventoLoc;
    private double eventoValor;
    private int eventoVaga;
    private int eventoHoras;

    public evento(String eventoCod,
            String eventoNome,
            String eventoLoc,
            double eventoValor,
            int eventoVaga,
            int eventoHoras) {

        this.eventoCod = eventoCod;
        this.eventoNome = eventoNome;
        this.eventoLoc = eventoLoc;
        this.eventoValor = eventoValor;
        this.eventoVaga = eventoVaga;
        this.eventoHoras = eventoHoras;
    }

    public boolean desconto() {
        return eventoValor >= 300;
    }

    public String situacaoVagas() {
        if (eventoVaga <= 10) {
            return "Atenção! As vagas estão acabando.";
        } else if (eventoVaga <= 30) {
            return "Quantidade de vagas moderada.";
        } else {
            return "Muitas vagas disponíveis.";
        }
    }

    public void status() {
        System.out.println("Código do evento: " + eventoCod);
        System.out.println("Nome do evento: " + eventoNome);
        System.out.println("Localização do evento: " + eventoLoc);
        System.out.println("Valor do evento: R$ " + eventoValor);
        System.out.println("Vagas restantes: " + eventoVaga);
        System.out.println("Carga horária: " + eventoHoras + " horas");

        System.out.println("Situação das vagas: " + situacaoVagas());


        if (desconto()) {
            System.out.println("Pode receber desconto.");
        } else {
            System.out.println("Não pode receber desconto.");
        }
    }
}