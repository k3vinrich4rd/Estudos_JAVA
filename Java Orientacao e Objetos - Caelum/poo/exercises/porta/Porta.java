package poo.exercises.porta;

public class Porta {
    boolean aberta;
    String cor;
    int dimensaoX;
    int dimensaoY;
    int dimensaoZ;

    void abre() {
        this.aberta = true;
    }

    void fecha() {
        this.aberta = false;
    }

    void pinta(String cor) {
        this.cor = cor;
    }

    boolean estaAberta() {
        if (!this.aberta) {
            System.out.println("Não esta aberta");
            return false;
        } else {
            System.out.println("Esta aberta");
            return true;
        }

    }


}
