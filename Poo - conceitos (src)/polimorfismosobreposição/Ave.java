package polimorfismosobreposição;

public class Ave extends Animal { // Classe Filha
    private String corDaPena;
    private boolean fazerNinho;

    //Métodos especiais (construtor)
    public Ave(double peso, int idade, int membros, String corDaPena) {
        super(peso, idade, membros);
        this.corDaPena = corDaPena;

    }

    //Polimorfismo
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    //Polimorfismo
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    //Polimorfismo
    @Override
    public void emitirSom() {
        System.out.println("fiu fiu fiu fiu");
    }

    public void fazerninho(){
        System.out.println("Construindo um ninho");
    }

    //Método
    public String getCorDaPena() {
        return corDaPena;
    }

    //Método
    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }

}
