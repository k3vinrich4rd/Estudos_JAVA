package canetaguanabara2;

public class MainCaneta2 {
    public static void main(String[] args) {
        Caneta2 caneta1 = new Caneta2();
        caneta1.modelo = "Faber Castell";
        caneta1.cor = "Preta";
        caneta1.carga = 55;
        caneta1.status();
        caneta1.destampar();
        caneta1.pintar();

        Caneta2 caneta2 = new Caneta2();
        caneta2.modelo = "Bic Cristal";
        caneta2.cor = "Azul";
        caneta2.carga = 87;
        caneta2.status();
        caneta2.destampar();
        caneta2.escrever();

        Caneta2 caneta3 = new Caneta2();
        caneta3.modelo = "Bic Cristal";
        caneta3.cor = "Vermelha";
        caneta3.carga = 73;
        caneta3.status();
        caneta3.destampar();
        caneta3.rabiscar();




    }
}
