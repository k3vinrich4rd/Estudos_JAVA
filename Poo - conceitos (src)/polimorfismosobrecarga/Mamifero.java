package polimorfismosobrecarga;

public class Mamifero extends Animal{
    protected String corPelo;

    public Mamifero(double peso, int idade, int membros) {
        super(peso, idade, membros);
    }


    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
