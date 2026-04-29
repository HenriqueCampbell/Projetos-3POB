 public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Gerente("Carlos", 7453.34, "Vendas");
        func1.exibirDados();
        
        double bonus = func1.calcularBonus(10);
        System.out.println("Bônus: " + bonus);
        
    }
 }