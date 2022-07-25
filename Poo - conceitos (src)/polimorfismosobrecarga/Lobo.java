package polimorfismosobrecarga;

public class Lobo extends Animal{
    public Lobo(double peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuuuuuuuuuu!");
    }
}
