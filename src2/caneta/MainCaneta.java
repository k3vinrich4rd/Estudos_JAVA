package caneta;

public class MainCaneta {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.modelo = "Bic";
        caneta.cor = "Azul";
        caneta.ponta = 0.5;
        caneta.tampada = true;
        caneta.status();
        caneta.rabiscar();
        System.out.println();

        Caneta caneta2 = new Caneta();
        caneta2.modelo = "Faber Castell";
        caneta2.cor = "Preta";
        caneta2.ponta = 0.3;
        caneta2.tampada = false;
        caneta2.status();
        caneta2.rabiscar();
    }
}
