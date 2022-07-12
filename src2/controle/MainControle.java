package controle;

public class MainControle {
    public static void main(String[] args) {
        Controle controle = new Controle();
        controle.marca = "lG";
        controle.cor = "Preta";
        controle.ligado = true;
        controle.status();
        controle.desligado();
    }
}
