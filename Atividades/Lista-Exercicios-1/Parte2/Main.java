public class Main {
    public static void main(String[] args) {
        GerenciadorFrota gerenciador = new GerenciadorFrota();

        // Teste de Carro e Caminhão com placas válidas e inválidas
        System.out.println("Executando Ação 1...");
        try {
            Carro carroInvalido = new Carro("ABC12", 2000.0, 1000);
        } catch (PlacaInvalidaException e) {
            System.out.println("Ocorreu uma exceção. Exceção mitigada: " + e.getMessage());
        }

        System.out.println("\nExecutando Ação 2...");
        Carro carroValido = new Carro("ABC1D23", 1500.0, 5000); // 7 chars
        Caminhao caminhaoValido = new Caminhao("XYZ9K87", 5000.0, 10.5); // 7 chars

        gerenciador.adicionarVeiculo(carroValido);
        gerenciador.adicionarVeiculo(caminhaoValido);
        System.out.println("Veículos válidos adicionados à frota em memória.");

        // Gravação no arquivo "frota.txt"
        System.out.println("\nExecutando Ação 3...");
        gerenciador.salvarDadosEmArquivo("frota.txt");

        // Leitura e exibição das linhas no console
        System.out.println("\nExecutando Ação 4...");
        gerenciador.lerDadosDoArquivo("frota.txt");
    }
}