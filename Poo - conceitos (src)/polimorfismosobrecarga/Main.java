package polimorfismosobrecarga;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(5,3,4);
        cachorro.reagir("toma comida");
        cachorro.reagir(11,45);
        cachorro.reagir(19,10);
        cachorro.reagir(false);




       /* Mamifero mamifero = new Mamifero(3.5,3,4);
        mamifero.emitirSom();
        System.out.println();

        Cachorro cachorro = new Cachorro(3.5,3,4);
        cachorro.emitirSom();
        System.out.println();

         Lobo lobo = new Lobo(3.5,3,4);
        lobo.emitirSom();
        System.out.println();
        */
    }
}
