package controller;

import model.Veiculo;
import model.Carro;
import model.Caminhao;
import model.Tributavel;
import repository.FrotaRepository;

import java.util.List;

public class FrotaController {
    private List<Veiculo> frota;
    private FrotaRepository repository;

    public FrotaController() {
        this.repository = new FrotaRepository();
        // Carrega os dados do arquivo txt para a frota ao iniciar o controller
        this.frota = repository.carregarDados(); 
    }

    public void cadastrarCarro(String placa, double custoFixo, int quilometragem) {
        Carro novoCarro = new Carro(placa, custoFixo, quilometragem);
        this.frota.add(novoCarro);
        repository.salvarDados(this.frota); // Salva no txt na mesma hora
    }

    public void cadastrarCaminhao(String placa, double custoFixo, double toneladas) {
        Caminhao novoCaminhao = new Caminhao(placa, custoFixo, toneladas);
        this.frota.add(novoCaminhao);
        repository.salvarDados(this.frota);
    }

    public List<Veiculo> getFrota() {
        return this.frota;
    }

    public double calcularTotalImpostos() {
        double total = 0;
        for (Veiculo v : frota) {
            if (v instanceof Tributavel) {
                total += ((Tributavel) v).calcularIPVA();
            }
        }
        return total;
    }
}