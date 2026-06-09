package view;

import controller.FrotaController;
import java.util.Scanner;
import model.Carro;
import model.Veiculo;

public class MainView {
    public static void main(String[] args) {
        FrotaController controller = new FrotaController();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Bem-vindo ao Sistema de Gestão de Frota Corporativa!");

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Cadastrar Caminhão");
            System.out.println("3. Listar Frota Completa");
            System.out.println("4. Ver Total de Impostos (IPVA)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Placa do Carro (Ex: ABC1234): ");
                    String pCarro = scanner.nextLine();
                    System.out.print("Custo Fixo Base: ");
                    double cCarro = Double.parseDouble(scanner.nextLine());
                    System.out.print("Quilometragem atual: ");
                    int km = Integer.parseInt(scanner.nextLine());
                    
                    controller.cadastrarCarro(pCarro, cCarro, km);
                    System.out.println(">>> Carro cadastrado e salvo no arquivo!");
                    break;

                case 2:
                    System.out.print("Placa do Caminhão (Ex: XYZ9876): ");
                    String pCami = scanner.nextLine();
                    System.out.print("Custo Fixo Base: ");
                    double cCami = Double.parseDouble(scanner.nextLine());
                    System.out.print("Toneladas de Carga suportada: ");
                    double ton = Double.parseDouble(scanner.nextLine());
                    
                    controller.cadastrarCaminhao(pCami, cCami, ton);
                    System.out.println(">>> Caminhão cadastrado e salvo no arquivo!");
                    break;

                case 3:
                    System.out.println("\n--- VEÍCULOS REGISTRADOS ---");
                    if (controller.getFrota().isEmpty()) {
                        System.out.println("A frota está vazia no momento.");
                    } else {
                        for (Veiculo v : controller.getFrota()) {
                            String tipo = v instanceof Carro ? "Carro" : "Caminhão";
                            System.out.println("[" + tipo + "] Placa: " + v.getPlaca() + 
                                               " | Custo Fixo: R$" + v.getCustoFixo() + 
                                               " | Custo Total Final: R$" + v.calcularCustoTotal());
                        }
                    }
                    break;

                case 4:
                    double totalImpostos = controller.calcularTotalImpostos();
                    System.out.printf(">>> Total de IPVA acumulado da frota: R$ %.2f\n", totalImpostos);
                    break;

                case 5:
                    System.out.println("Encerrando o sistema... Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida no menu.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}