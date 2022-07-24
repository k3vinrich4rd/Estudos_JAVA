package polimorfismosobreposição;

public class Cachorro extends Mamifero {
    public Cachorro(double peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros, corDoPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Auuuuuuuu");
    }

    public void enterrarOsso() {
        System.out.println("Enterrando o osso");
    }

    public void abanarORabo() {
        System.out.println("Abanando o rabo");
    }

}
