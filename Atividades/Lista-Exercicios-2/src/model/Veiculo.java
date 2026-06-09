package model;

public abstract class Veiculo {
    private String placa;
    private double custoFixo;

    public Veiculo(String placa, double custoFixo) {
        // Validação da placa (tem que ser exatamente 7 caracteres)
        if (placa == null || placa.length() != 7) {
            throw new PlacaInvalidaException(placa);
        }
        this.placa = placa;
        this.custoFixo = custoFixo;
    }

    public abstract double calcularCustoTotal();

    public String getPlaca() { return placa; }
    public double getCustoFixo() { return custoFixo; }

    public abstract String formatarParaArquivo();
}