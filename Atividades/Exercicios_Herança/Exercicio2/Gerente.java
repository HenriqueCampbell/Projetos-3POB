// Subclasse
public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario); // chama o construtor da classe base
        this.departamento = departamento;
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); // reaproveita o método da classe base
        System.out.println("Departamento: " + departamento);
    }
    
    @Override
    public double calcularBonus(int horaExtra) {
        double bonus;
        
        bonus = (salario / 20) * (1.5 * (double)horaExtra);
        
        return bonus;
    }
}