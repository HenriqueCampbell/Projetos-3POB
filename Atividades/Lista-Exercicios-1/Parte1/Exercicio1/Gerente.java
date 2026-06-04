public class Gerente extends Funcionario {
    private double bonus;
    
    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario); // chama o construtor da classe base
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
}