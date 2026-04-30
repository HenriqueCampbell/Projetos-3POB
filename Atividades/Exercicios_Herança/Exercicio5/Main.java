 public class Main {
    public static void main(String[] args) {
        Gerente func1 = new Gerente("Carlos", 7453.34, "Vendas");
        func1.exibirDados();
        
        if (func1.autenticar("123") == true) {
            System.out.println("Funcionário 1 autenticado com sucesso");
        }
        else {
            System.out.println("Acesso de Funcionário 1 negado");
        }
        
        Cliente clnt1 = new Cliente("Alexandro", 1322342);
        clnt1.exibirDados();

        if (clnt1.autenticar("122") == true) {
            System.out.println("Cliente 1 autenticado com sucesso");
        }
        else {
            System.out.println("Acesso de Cliente 1 negado");
        }
        
    }
 }