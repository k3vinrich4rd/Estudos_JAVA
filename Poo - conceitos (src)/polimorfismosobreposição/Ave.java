package polimorfismosobreposição;

public class Ave extends Animal {
    private String corDaPena;
    private boolean fazerNinho;

    public Ave(double peso, int idade, int membros, String corDaPena) {
        super(peso, idade, membros);
        this.corDaPena = corDaPena;

    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("fiu fiu fiu fiu");
    }

    public void fazerninho(){
        System.out.println("Construindo um ninho");
    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }

}
