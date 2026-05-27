import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> listaDeProdutos;

    public CarrinhoDeCompras() {
        this.listaDeProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        this.listaDeProdutos.add(p);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto p : this.listaDeProdutos) {
            total += p.getPreco();
        }
        return total;
    }

    public void aplicarDescontoGeral(double percentual) {
        for (Produto p : this.listaDeProdutos) {
            p.aplicarDesconto(percentual);
        }
    }
}

