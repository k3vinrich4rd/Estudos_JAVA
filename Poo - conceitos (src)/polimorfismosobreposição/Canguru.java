package polimorfismosobreposição;

public class Canguru extends Mamifero {
    public Canguru(double peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros, corDoPelo);
    }

    public void usarBolsa() {
        System.out.println("Usando a bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

}

