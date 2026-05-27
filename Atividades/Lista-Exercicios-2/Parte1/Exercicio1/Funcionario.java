public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public String getNome() {
        return nome;
    }
    
    public abstract double calcularSalario();
    
    public void exibirFinal() {
        String nome = getNome();
        System.out.println(nome);
        
        double salarioFinal = calcularSalario();
        System.out.println(salarioFinal);
    }

}