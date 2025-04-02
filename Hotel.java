import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private List<Quarto> quartos;

    public Hotel(String nome) {
        this.nome = nome;
        this.quartos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarQuarto(Quarto quarto) {
        this.quartos.add(quarto);
    }

    public void exibirQuartos() {
        System.out.println("Quartos do hotel " + nome + ":");
        for (Quarto q : quartos) {
            System.out.println(" - Quarto nº " + q.getNumero() + " (andar " + q.getAndar() + ")");
        }
    }
}
