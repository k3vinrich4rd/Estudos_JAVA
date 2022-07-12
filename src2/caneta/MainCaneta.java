package caneta;

public class MainCaneta {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.cor = "Azul";
        caneta.ponta = 0.5;
        caneta.tampada = false;
        caneta.status();
    }
}
