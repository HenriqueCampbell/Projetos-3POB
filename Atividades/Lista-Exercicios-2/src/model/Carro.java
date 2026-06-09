package model;

public class Carro extends Veiculo implements Tributavel {
    private int quilometragem;

    public Carro(String placa, double custoFixo, int quilometragem) {
        super(placa, custoFixo); // O super() valida a placa pela classe mãe
        this.quilometragem = quilometragem;
    }

    @Override
    public double calcularCustoTotal() {
        return getCustoFixo() + (this.quilometragem * 0.15);
    }

    @Override
    public double calcularIPVA() {
        return getCustoFixo() * 0.04;
    }

    @Override
    public String formatarParaArquivo() {
        return "CARRO;" + getPlaca() + ";" + getCustoFixo() + ";" + this.quilometragem;
    }
}