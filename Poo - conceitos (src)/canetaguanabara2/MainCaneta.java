package canetaguanabara2;

public class MainCaneta {
    public static void main(String[] args) {
      // Objeto
      Caneta caneta1 = new Caneta();
      caneta1.modelo = "Bic Cristal";
      caneta1.cor = "Azul";
      caneta1.ponta = 0.5;
      caneta1.carga = 90;
      caneta1.statusCaneta();
      caneta1.tampar();
      caneta1.rabiscar();

      Caneta caneta2 = new Caneta();
      caneta2.modelo = "Faber Castell";
      caneta2.cor = "Preta";
      caneta2.ponta = 1.0;
      caneta2.carga = 55;
      caneta2.statusCaneta();
      caneta2.destampar();
      caneta2.rabiscar();



    }

}
