package estruturaderepeticao.exercicios;
// Utilizando a estrutura de repetição (for):
public class ContadorDeNumerosImparesFor {
    public static void main(String[] args) {
        int numerosImpares = 0;
        // Estrutura de repetição
        for (int numeros = 1; numeros <= 50; numeros++) {
            if (numeros % 2 != 0) {
                numerosImpares = numeros;
                System.out.println(numerosImpares);
            }

        }
    }
}
