public class Main {

    public static void main(String[] args) {

    Funcionario fulano = new Gerente("Carlos", 7453.34, 500.34);
    Funcionario ciclana = new Desenvolvedor("Gabriela", 8345.32, 4);
    
    fulano.exibirFinal();
    ciclana.exibirFinal();

    }
}