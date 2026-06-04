public class Desenvolvedor extends Funcionario {
    private int horasExtras;
    private final double VALOR_HORA = 50.00;
    
    public Desenvolvedor(String nome, double salario, int horasExtras) {
        super(nome, salario); // chama o construtor da classe base
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * VALOR_HORA);
    }
}