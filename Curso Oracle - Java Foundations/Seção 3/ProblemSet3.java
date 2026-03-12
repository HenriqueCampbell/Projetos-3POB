import java.util.Scanner;

public class ProblemSet3 {

    public static void main(String[] args) {
        String name;
        int idade;
        double piada;
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Qual é o seu nome?");
        name = sc.nextLine();

        System.out.println("É um prazer em te conhecer, " + name);

        System.out.println("Quantos anos você tem?");
        idade = sc.nextInt();

        System.out.println("Ah, então você tem " + idade + " anos!");

        System.out.println("E qual o seu número do cartão de crédito e os 3 dígitos do código de segurança? \n Brincaidera!! Em uma escala de 0 a 10000000.99 o quanto você achou essa piada engraçada?");
        piada = sc.nextDouble();

        if (piada < 5000049.5) 
        {
            System.out.println("Nossa, você é tão mal comigo ;-;");
        } else if (piada < 10000000.99) 
        {
            System.out.println("Uau, você realmente gostou! Obrigado pelo apoio. ^^");
        } else 
        {
            System.out.println("Seu divertimento ultrapassou os limites permitidos <3!");
        }


        System.out.println("Sabia que em marte você teria " + (idade * (365/687.0)) + " anos?");

        System.out.println("Tão jovem!");

        System.out.println("Obrigado pelas respostas, " + name + "!");
        sc.close();
     
    }   
}