package estruturaderepeticao.exercicios;
//Utilizando estrutura de repetição (for):
public class ContadorDeNumeroImpares {
    public static void main(String[] args) {
        // Estrutura de repetição:
        for (int contador = 0; contador <= 100000; contador++) {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
        }
    }
}
