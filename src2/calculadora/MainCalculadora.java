package calculadora;

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); // Objeto
        calculadora.calculadoraDeDoisNumeros(); // Método
        System.out.println("Finalizando calculos");
        calculadora.subtracaoDeDoisNumeros(); // Método
    }
}
