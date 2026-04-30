public abstract class Conta {
    private String titular;
    protected double saldo;
    private int idBancario;
    private int agencia;

    public Conta(String titular, double saldo, int idBancario, int agencia) {
        this.titular = titular;
        this.saldo = saldo;
        this.idBancario = idBancario;
        this.agencia = agencia;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo+=valor;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            this.saldo-=valor;
        }
    }
}