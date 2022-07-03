package estruturaderepeticao.exercicios;

public class ContadorDeNumeroImpares {
    public static void main(String[] args) {
        for (int contador = 0; contador <= 100000; contador++) {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
        }
    }
}
