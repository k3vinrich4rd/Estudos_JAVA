package polimorfismosobreposicao;
//Classe filha
public class Reptil extends Animal {
    private String corEscama; // Atributo

    //Método constructor
    public Reptil(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    //Polimorfismo
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    //Polimorfismo
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    //Polimorfismo
    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    //Método de acesso e modificação
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
