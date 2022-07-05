package estruturaderepeticao.exercicios;
//Utilizando estrutura de repetição (for):
public class ImprimindoNumerosPares {
    public static void main(String[] args) {
        // Estrutura de repetição
        for (int contador = 1; contador <= 100000; contador++) {
           if (contador % 2 == 0 ){ // Números pares
               // Números impares = contador % 2 != 0
               System.out.println(contador);
           }
        }
    }
}
