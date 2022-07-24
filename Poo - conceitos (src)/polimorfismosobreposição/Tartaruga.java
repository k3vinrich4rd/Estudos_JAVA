package polimorfismosobreposição;
// Classe neta
public class Tartaruga extends Reptil{

    //Método constructor
    public Tartaruga(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    //Polimorfismo
    @Override
    public void locomover() {
        System.out.println("Andando beeeem devagar");
    }
}
