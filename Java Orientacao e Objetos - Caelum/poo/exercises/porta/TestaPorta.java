package poo.exercises.porta;

public class TestaPorta {
    public static void main(String[] args) {
        Porta porta = new Porta();
        porta.cor = "Vermelha";
        porta.dimensaoX = 7;
        porta.dimensaoY = 23;
        porta.dimensaoZ = 4;

        porta.aberta = true;
        System.out.println(porta.estaAberta());

        System.out.println();

        porta.aberta = false;
        System.out.println(porta.estaAberta() + "\n");
        System.out.println("A cor desta porta é: " + porta.cor);

    }
}
