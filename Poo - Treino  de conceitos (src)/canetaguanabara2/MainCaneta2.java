package canetaguanabara2;

public class MainCaneta2 {
    public static void main(String[] args) {
        Caneta2 caneta1 = new Caneta2("Faber Castell", "Preta", 0.6, 76);
        caneta1.status();
        caneta1.tampar();
        caneta1.pintar();

        Caneta2 caneta2 = new Caneta2("Bic Cristal", "Azul", 0.5, 87);
        caneta2.status();
        caneta2.destampar();
        caneta2.escrever();

        Caneta2 caneta3 = new Caneta2("Bic Cristal", "Vermelha", 1.0, 73);
        caneta3.status();
        caneta3.destampar();
        caneta3.rabiscar();


    }
}
