package canetaguanabara2;

public class MainCaneta {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.modelo = "Bic Cristal";
        caneta.cor = "Preta";
        // caneta.ponta = 0.5;
        caneta.carga = 80;
       // caneta.tampada = false;
        caneta.destampar();
        caneta.status();
        caneta.rabiscar();
    }
}
