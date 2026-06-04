import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorFrota {
    private List<Veiculo> frota = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v) {
        this.frota.add(v);
    }

    // Gravação dos dados utilizando BufferedWriter
    public void salvarDadosEmArquivo(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Veiculo v : frota) {
                writer.write(v.formatarParaArquivo());
                writer.newLine();
            }
            System.out.println("Dados gravados com sucesso em: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    // Lendo retroativamente o arquivo utilizando BufferedReader e exibindo em tela
    public void lerDadosDoArquivo(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        if (!arquivo.exists()) {
            System.out.println("Arquivo não encontrado.");
            return;
        }

        System.out.println("\n--- LENDO DADOS DIRETO DO ARQUIVO ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                // Exibe a linha crua no console conforme solicitado na Ação 4
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}