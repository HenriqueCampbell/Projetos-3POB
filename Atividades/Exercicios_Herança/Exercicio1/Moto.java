// Subclasse
public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo); // chama o construtor da classe base
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); // reaproveita o método da classe base
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }
    
    
}