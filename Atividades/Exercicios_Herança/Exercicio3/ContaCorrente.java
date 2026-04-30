public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, double saldo, int idBancario, int agencia, double limite) {
        super(titular, saldo, idBancario, agencia);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (this.saldo+this.limite) >= valor ) {
            this.saldo-=valor;
        }
    }
}