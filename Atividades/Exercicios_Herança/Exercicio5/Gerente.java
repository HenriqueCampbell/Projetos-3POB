// Subclasse
public class Gerente extends Funcionario implements Autenticavel {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario); // chama o construtor da classe base
        this.departamento = departamento;
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.equals("123");
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); // reaproveita o método da classe base
        System.out.println("Departamento: " + departamento);
    }
    
}