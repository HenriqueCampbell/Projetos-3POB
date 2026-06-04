public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(double saldoDisponivel, double valorSolicitado) {
        // Passa a mensagem limpa para a classe mãe (Exception)
        super("Falha no saque! Saldo disponível: R$ " + saldoDisponivel + " | Valor solicitado: R$ " + valorSolicitado);
    }
}