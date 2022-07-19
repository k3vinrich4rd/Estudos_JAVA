package uec;

import java.util.Random;

public class Luta {

    private Lutador desafiado; // Agregação
    //Tipos abstratos de dados
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("----------------------------------");
            System.out.println("======= DESAFIADO =======");
            System.out.println("Informações e características:");
            System.out.println("----------------------------------");
            desafiado.apresentar();
            System.out.println("----------------------------------");
            System.out.println("======== DESAFIANTE ========");
            System.out.println("Informações e características: ");
            System.out.println("----------------------------------");
            desafiante.apresentar();

            Random numeroAleatorio = new Random();
            int vencedor = numeroAleatorio.nextInt(3);
            System.out.println("\n========== RESULTADO DA LUTA ==========");
            switch (vencedor) {
                case 0:
                    System.out.println("A luta empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

            }
            System.out.println("====================================");


        } else {
            System.out.println("A luta não pode acontecer! ");
        }
    }


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

