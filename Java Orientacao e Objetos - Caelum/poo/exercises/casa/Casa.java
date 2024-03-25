package poo.exercises.casa;

public class Casa {
    String cor;
    boolean porta1;
    boolean porta2;
    boolean porta3;

    void pinta(String cor) {
        this.cor = cor;
    }

    int quantasPortasEstaoAbertas() {
        if (porta1 && porta2 && porta3) {
            return 3;
        } else if (porta1 && porta2) {
            return 2;
        } else if (porta1 || porta2 || porta3) {
            return 1;
        }
        else {
            return 0;
        }

    }

}
