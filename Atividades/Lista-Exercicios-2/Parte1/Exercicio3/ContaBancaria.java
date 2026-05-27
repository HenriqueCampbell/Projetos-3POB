public class ContaBancaria {
    private String titular;
    private double saldo;
    
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException(this.saldo, valor);
        }
        this.saldo -= valor;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
}