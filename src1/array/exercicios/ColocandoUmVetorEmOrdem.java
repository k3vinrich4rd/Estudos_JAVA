package array.exercicios;
// Declarando uma array:
import java.util.Arrays;
// Colocando um vetor em ordem:
public class ColocandoUmVetorEmOrdem {
    public static void main(String[] args) {
        double[] numerosComPontoFlutuante = {3.45, 7.80, 14.98, 4.21, 1, 21};
        Arrays.sort(numerosComPontoFlutuante); // Como colocar números em ordem
        for (double num : numerosComPontoFlutuante) { //ForEach
            System.out.print(num + " ");
        }
    }
}
