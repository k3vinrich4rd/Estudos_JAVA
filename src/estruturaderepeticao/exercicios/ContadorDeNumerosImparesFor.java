package estruturaderepeticao.exercicios;

public class ContadorDeNumerosImparesFor {
    public static void main(String[] args) {
        int numerosImpares = 0;
        for (int numeros = 1; numeros <= 50; numeros++) {
            if (numeros % 2 != 0) {
                numerosImpares = numeros;
                System.out.println(numerosImpares);
            }

        }
    }
}
