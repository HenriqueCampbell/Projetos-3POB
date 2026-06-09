package repository;

import model.Veiculo;
import model.Carro;
import model.Caminhao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FrotaRepository {
    private static final String NOME_ARQUIVO = "frota.txt";

    // Recebe a lista do Controller e joga pro arquivo txt
    public void salvarDados(List<Veiculo> frota) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO))) {
            for (Veiculo v : frota) {
                writer.write(v.formatarParaArquivo());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro crítico ao salvar no arquivo: " + e.getMessage());
        }
    }

    // Lê o arquivo txt e reconstrói os objetos do Model
    public List<Veiculo> carregarDados() {
        List<Veiculo> frotaCarregada = new ArrayList<>();
        File arquivo = new File(NOME_ARQUIVO);
        
        if (!arquivo.exists()) {
            return frotaCarregada; // Se o arquivo não existir ainda, retorna a lista vazia
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                String tipo = dados[0];
                String placa = dados[1];
                double custoFixo = Double.parseDouble(dados[2]);

                // Recria o objeto dependendo do que estava escrito no começo da linha
                if (tipo.equals("CARRO")) {
                    int quilometragem = Integer.parseInt(dados[3]);
                    frotaCarregada.add(new Carro(placa, custoFixo, quilometragem));
                } else if (tipo.equals("CAMINHAO")) {
                    double toneladas = Double.parseDouble(dados[3]);
                    frotaCarregada.add(new Caminhao(placa, custoFixo, toneladas));
                }
            }
        } catch (IOException e) {
            System.err.println("Erro crítico ao carregar o arquivo: " + e.getMessage());
        }
        
        return frotaCarregada;
    }
}