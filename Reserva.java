import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String dataEntrada;
    private String dataSaida;
    private List<Quarto> quartos; 
    private Veiculo veiculo; 

    public Reserva(String dataEntrada, String dataSaida) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quartos = new ArrayList<>();
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void adicionarQuarto(Quarto quarto) {
        this.quartos.add(quarto);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void checkin(Hospede hospede) {
        System.out.println("Check-in realizado para o hóspede: " + hospede.getNome());
    }

    public void checkout() {
        System.out.println("Checkout realizado. Data de saída: " + dataSaida);
    }

    public void cancelar() {
        System.out.println("Reserva cancelada.");
    }
}
