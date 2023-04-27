package polimorfismosobreposicao;
// Classe neta
public class Arara extends Ave{
    public Arara(double peso, int idade, int membros, String corDaPena) {
        super(peso, idade, membros, corDaPena);
    }

    //Polimorfismo
    @Override
    public void emitirSom() {
        System.out.println("fiu fiu fiu fiu");
    }
}
