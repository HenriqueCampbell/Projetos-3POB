public class Tip01 {
    public static void main(String[] args) {
        int[] custos = {10, 12, 9, 8, 7, 15, 11, 30};
        double imposto = 0.05;
        double gorjeta = 0.15;
        double valorFinal;

        for (int i = 0; i < custos.length; i++) {
            valorFinal = custos[i] * (1 + imposto + gorjeta);
            System.out.println("Pessoa " + (i + 1) + " deve pagar: R$" + String.format("%.2f", valorFinal));
        }

        // Encontre o valor que cada pessoa deve pagar após imposto(5%) e gorjeta(15%)
        
        /*Esse é o valor que cada pessoa deve pagar antes do imposto e gorjeta:
        Pessoa 1: R$10.00
        Pessoa 2: R$12.00
        Pessoa 3: R$9.00
        Pessoa 4: R$8.00
        Pessoa 5: R$7.00
        Pessoa 6: R$15.00
        Pessoa 7: R$11.00
        Pessoa 8: R$30.00
        */
        
    }    
}
