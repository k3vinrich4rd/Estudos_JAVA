package metodosespeciais;

public class MainCaneta {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Bic Cristal", 0.5,"Preta");
        caneta.status();
        System.out.println();
        Caneta caneta1 = new Caneta("Faber Castell", 0.4, "Azul");
        caneta1.status();

    }
}
