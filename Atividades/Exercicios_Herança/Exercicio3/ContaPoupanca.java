public class ContaPoupanca extends Conta {
    private double taxa;

    public ContaPoupanca(String titular, double saldo, int idBancario, int agencia, double taxa) {
        super(titular, saldo, idBancario, agencia);
        this.taxa = taxa;
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + this.taxa;
        if (valor > 0 && this.saldo >= valorTotal ) {
            this.saldo-=valorTotal;
        }
    }
}