public class Main {
    public static void main(String[] args) {
        // Testando a Conta Corrente
        ContaCorrente cc = new ContaCorrente("Henrique", 100.0, 123, 001, 500.0);
        
        System.out.println("Saldo inicial: " + cc.getSaldo());
        
        // Tentando sacar mais do que tem (usando o limite)
        cc.sacar(400.0); 
        System.out.println("Saldo após saque de 400 (usou 300 do limite): " + cc.getSaldo());
        
        // Tentando estourar o limite (Saldo -300 + Limite 500 = 200 disponíveis)
        cc.sacar(300.0);
        System.out.println("Saldo após tentar sacar 300 (não deve mudar): " + cc.getSaldo());

        System.out.println("\n--- TESTE CONTA POUPANÇA ---");
        ContaPoupanca cp = new ContaPoupanca("Henrique", 100.0, 456, 001, 2.0);
        
        System.out.println("Saldo inicial: " + cp.getSaldo());
        
        // Sacando 50 (deve tirar 52 por causa da taxa)
        cp.sacar(50.0);
        System.out.println("Saldo após saque de 50 + taxa de 2: " + cp.getSaldo());
        
        // Tentando sacar mais do que tem (Poupança não tem limite!)
        cp.sacar(60.0); 
        System.out.println("Saldo após tentar sacar 60 (é para dar erro): " + cp.getSaldo());
    }
}