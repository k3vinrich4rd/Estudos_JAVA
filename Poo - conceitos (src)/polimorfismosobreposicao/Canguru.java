package polimorfismosobreposicao;

public class Canguru extends Mamifero { // classe neta

    //Método construtor
    public Canguru(double peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros, corDoPelo);
    }

    //Método
    public void usarBolsa() {
        System.out.println("Usando a bolsa");
    }

    //Polimorfismo
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

}

