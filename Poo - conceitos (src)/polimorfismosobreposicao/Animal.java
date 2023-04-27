package polimorfismosobreposicao;

public abstract class Animal { // Classe mãe
    protected double peso;
    protected int idade;
    protected int membros;

    //Métodos especiais (construtor)
    public Animal(double peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    //Método
    public void locomover() {

    }
    //Método
    public void alimentar() {

    }

    //Método
    public void emitirSom() {

    }

    //Métodos de modificadores e de acesso:
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
