public abstract class Animal {
    public abstract void fazerSom(); // Método sem corpo, as filhas decidem o que fazer
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Au Au!");
    }
}

class Gato extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}