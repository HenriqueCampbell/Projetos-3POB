public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ronaldo", 500.0);

        try {
            System.out.println("Tentando sacar R$ 600,00...");
            conta.sacar(600.0);

            System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + conta.getSaldo());
            
        } catch (SaldoInsuficienteException e) {
            System.out.println("[Erro Transacional] " + e.getMessage());
        }
    }
}