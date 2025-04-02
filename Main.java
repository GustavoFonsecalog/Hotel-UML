public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Beira Mar");
        Quarto quarto1 = new Quarto(101, 1);
        Quarto quarto2 = new Quarto(202, 2);
        hotel.adicionarQuarto(quarto1);
        hotel.adicionarQuarto(quarto2);

        hotel.exibirQuartos();

        Cargo cargoGerente = new Cargo("Gerente");
        Funcionario funcionario = new Funcionario("Carlos Silva", 3000.00, cargoGerente);
        System.out.println("Funcionário: " + funcionario.getNome() + 
                           ", Cargo: " + funcionario.getCargo().getNome() + 
                           ", Salário: " + funcionario.getSalario());

        funcionario.mudarSalario(3500.00);
        System.out.println("Novo salário: " + funcionario.getSalario());

        Hospede hospede = new Hospede("Ana Souza", "Rua B, 45", "RG123456");
        System.out.println("Hóspede: " + hospede.getNome() + 
                           ", Endereço: " + hospede.getEndereco());

        Reserva reserva = new Reserva("2025-05-10", "2025-05-15");
        reserva.adicionarQuarto(quarto1);
        reserva.adicionarQuarto(quarto2);

        Veiculo veiculo = new Veiculo("ABC-1234", "Sedan");
        reserva.setVeiculo(veiculo);

        reserva.checkin(hospede);

        reserva.checkout();

        reserva.cancelar();
    }
}
