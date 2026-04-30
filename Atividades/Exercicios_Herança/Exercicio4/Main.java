public class Main {
    public static void main(String[] args) {

        Animal[] lista = { new Cachorro(), new Gato() };

        for (int i = 0; i < lista.length; i++){
            lista[i].fazerSom();
        }
    }
}